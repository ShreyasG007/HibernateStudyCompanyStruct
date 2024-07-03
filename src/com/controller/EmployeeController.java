package com.controller;

import java.util.List;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public List<Employee> getEmployeeData() {
		EmployeeService service = new EmployeeService();
		return service.getEmployeeData();
	}
	
	public String insertData(Employee employee) {
		EmployeeService service = new EmployeeService();
		return service.insertData(employee);
	}
}
