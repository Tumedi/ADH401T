package com.gui.controller;

import java.util.List;

import com.ejb.service.EmployeeService;
import com.jpa.entities.Employee;

@ManagedBean(name = "employees", eager = true)
@SessionScoped
public class EmployeeController {

	@EJB
	EmployeeService employeeService;
	
	private String empName;
	private String empSurname;
	private String empContact;
	private String empEmail;
	private double empSalary;
	
	public List<Employee> getAllEmployees(){
		return employeeService.findAllEmployees();
	}

	public EmployeeController(String empName, String empSurname, String empContact, String empEmail, double empSalary) {
		this.empName = empName;
		this.empSurname = empSurname;
		this.empContact = empContact;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}
	
	public EmployeeController() {
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
}
