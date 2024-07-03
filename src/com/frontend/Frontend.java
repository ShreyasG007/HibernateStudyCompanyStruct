package com.frontend;

import java.util.List;

import com.controller.EmployeeController;
import com.entity.Employee;

public class Frontend {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmployee_id(201);
		e1.setEmployee_name("Shreyas");
		e1.setEmployee_profile("Dev");
		e1.setEmployee_Salary(200000);
		e1.setEmployee_dateofjoin("2022-02-14");
		
		EmployeeController controller = new EmployeeController();
		String msg = controller.insertData(e1);
		
		System.out.println(msg);
		
		
	}
}
