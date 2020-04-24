package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:emp.properties")
public class JavaConfig {

    @Autowired
   private ApplicationContext applicationContext;


    public List<Employee>employees(){
        List<Employee>employees=new ArrayList<>();
        //
        //environment holds properties
        //
        Environment environment=applicationContext.getEnvironment();
        //
        //first employee
        //
        int id1=environment.getProperty("empId1",Integer.class);
        String name1=environment.getProperty("empName1");
        Double salary1=environment.getProperty("empSalary1",Double.class);
        int age1=environment.getProperty("empAge1",Integer.class);
        Employee employee1=new Employee(id1,name1,salary1,age1);

        //
        //second employee
        //
        int id2=environment.getProperty("empId2",Integer.class);
        String name2=environment.getProperty("empName2");
        Double salary2=environment.getProperty("empSalary2",Double.class);
        int age2=environment.getProperty("empAge2",Integer.class);
        Employee employee2=new Employee(id2,name2,salary2,age2);

        employees.add(employee1);
        employees.add(employee2);

        return  employees;

    }

    @Bean
    SBU sbu(){
        SBU sbu = new SBU();
        List<Employee>list=employees();
        sbu.setEmpList(list);
        return sbu;
    }

}
