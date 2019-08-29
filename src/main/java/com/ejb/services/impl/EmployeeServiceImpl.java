package com.ejb.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.service.EmployeeService;
import com.jpa.entities.Employee;

/**
 * Session Bean implementation class EmployeeServiceImpl
 */
@Stateless
@LocalBean
public class EmployeeServiceImpl implements EmployeeService{

	@PersistenceContext(name ="empmanagement")
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees(){
		System.out.println("Finding the employees ");
		return (List<Employee>) em.createNamedQuery("Employee.findAll");	
	}
}
