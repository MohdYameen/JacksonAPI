package com.nareshit.client;

import java.util.Scanner;

import com.nareshit.bean.Employee;
import com.nareshit.util.JsonUtil;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		emp.setEmpNo(201);
		emp.setName("Rama");
		emp.setSalary(20000);
		String jsonEmployee = JsonUtil.convertJavaToJson(emp);
		System.out.println(jsonEmployee);
	
		System.out.println("******************");
	/*	Employee emp1 = JsonUtil.convertJsonToJava(jsonEmployee, Employee.class);
		System.out.println(emp1.getEmpNo()+" "+emp1.getName()+ " " +emp1.getSalary());
		*/
		
	}

}
