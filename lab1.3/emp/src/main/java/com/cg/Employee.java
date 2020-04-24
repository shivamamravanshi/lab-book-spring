package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Employee {
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeName, double salary, int age){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.age=age;
	}
	
	private int employeeId;
	
	private String employeeName;
	
	private double salary;
	
	private int age;

	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printDetails() {
		System.out.println("Employee Details");
		System.out.println("---------------------------------");
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Age : "+age);
		
	}
	
}
