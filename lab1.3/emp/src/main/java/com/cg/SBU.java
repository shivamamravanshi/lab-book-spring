package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SBU {
	
	@Value("${subId}")
	private String sbuId;
	
	@Value("${subName}")
	private String sbuName;
	
	@Value("${subHead}")
	private String sbuHead;


	private List<Employee> empList ;

	public SBU() {

	}

	public List<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SUB Details [sbu Code = "+sbuId+", subHead = "+sbuHead+", subName = "+sbuName+"]";
	}

	public void printSBUDetails(){
		System.out.println("SBU Details\n-----------------------------------------");
		System.out.println(this.toString());
		for (Employee emp: empList
			 ) {
			emp.printDetails();
		}
	}


	
}
