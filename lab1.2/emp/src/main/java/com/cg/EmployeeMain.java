package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass=JavaConfig.class;
		context.register(configurationClass);
	    context.refresh();
	    
	    Employee emp = context.getBean(Employee.class);
	    emp.printDetails();
	    
	    //SBU sbu = context.getBean(SBU.class);
	    //System.out.println(emp.getBusinessUnit());
	}
	
}
