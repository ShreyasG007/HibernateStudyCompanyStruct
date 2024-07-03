package com.service;

import java.util.List;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {
	public List<Employee> getEmployeeData() {
		EmployeeDao dao = new EmployeeDao();
		return dao.getEmployeeData();
	}
	
	public String insertData(Employee employee) {
		EmployeeDao dao = new EmployeeDao();
		return dao.insertData(employee);
	}
}
