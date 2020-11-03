package com.nareshit.bean;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
@JsonPropertyOrder(value = {
		"name",	//to define the order
		"empNo"
})
public class Employee implements Serializable{
	private int empNo;
	private String name;
	@JsonIgnore	//to ignore salary from json
	private double salary;
	//use getter and setter automatically from eclipse
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
