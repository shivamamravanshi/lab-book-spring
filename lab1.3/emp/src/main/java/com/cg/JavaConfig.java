package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:emp.properties")
public class JavaConfig {
    @Bean
    SBU SBU(){
        SBU sbu = new SBU();
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(1,"Shivam",30000,22);
        Employee employee = new Employee(2,"Lucky",20000,25);
        employeeList.add(employee);
        employeeList.add(employee1);
        sbu.setEmpList(employeeList);
        return sbu;
    }

}
