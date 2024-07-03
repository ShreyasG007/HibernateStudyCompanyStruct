package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HIbernateConfig;
import com.entity.Employee;

public class EmployeeDao {
	public List<Employee> getEmployeeData() {
		SessionFactory sessionFactory = HIbernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();

	}

	public String insertData(Employee employee) {
		SessionFactory sessionFactory = HIbernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		return "data save Success";
		
	}
}
