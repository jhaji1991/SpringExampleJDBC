package com.java.program.service;

import com.java.program.model.Employee;

public interface EmployeeService {
	public abstract void createEmployee(Employee employee);
	
	public abstract Employee getEmployeeById(Integer employeeId);
}
