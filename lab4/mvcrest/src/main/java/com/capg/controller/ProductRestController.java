package com.capg.controller;

import java.util.List;

import com.capg.exceptions.ProductNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.capg.dto.ProductDto;
import com.capg.entities.Product;
import com.capg.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRestController {


    private static Logger Log = LoggerFactory.getLogger(ProductRestController.class);

    @Autowired
    private IProductService service;

    Product convert(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return product;
    }


    @PostMapping("/products/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto dto) {
        Product product = convert(dto);
        product = service.addProduct(product);
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }

    @GetMapping("/products/find/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
        Product product = service.fetchById(id);
        if (product == null) {
            ResponseEntity<Product> response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
            return response;
        }
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }


    @PutMapping("/products/update/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody ProductDto dto, @PathVariable("id") int id) {
        Product product = convert(dto);
        product.setId(id);
        product = service.updateProduct(product);
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> fetchAll() {
        List<Product> products = service.fetchAllProducts();
        ResponseEntity<List<Product>> response = new ResponseEntity<>(products, HttpStatus.OK);
        return response;
    }

    @DeleteMapping("/products/delete/{id}")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable int id) {
        boolean result = service.delete(id);
        ResponseEntity<Boolean> response = new ResponseEntity<>(result, HttpStatus.OK);
        return response;
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFound(ProductNotFoundException exception) {
        Log.error("handling exception", exception);
        String exceptionMsg=exception.getMessage();
        ResponseEntity<String> response = new ResponseEntity<>(exceptionMsg,HttpStatus.NOT_FOUND);
        return response;
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleAllExceptions(Throwable exception) {
        Log.error("handleAllExceptions", exception);
        String msg="something went wrong";
        ResponseEntity<String> response = new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
        return response;
    }


}
