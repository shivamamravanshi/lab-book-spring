package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cg.entities.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao{

	private Map<Integer,Employee>store=new HashMap<>();
	
	 public EmployeeDaoImpl(){
	        store.put(100,new Employee(100,"Shubham",30000.00));
	        store.put(101,new Employee(101,"Shivam",40000.00));
	    }
	 
	 @Override
	 public Employee fetchById(int id) {
		 Employee employee = null;
		 if(store.containsKey(id)) {
			  employee=store.get(id);
		 }
		 return employee;
	 }
	 


}
