package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass=JavaConfig.class;
		context.register(configurationClass);
	    context.refresh();

	    SBU sbu = context.getBean(SBU.class);
	    sbu.printSBUDetails();

	}
	
}
