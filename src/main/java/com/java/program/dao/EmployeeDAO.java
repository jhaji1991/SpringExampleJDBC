package com.java.program.dao;

import com.java.program.model.Employee;

public interface EmployeeDAO {
public abstract void createEmployee(Employee employee);
	
	public abstract Employee fetchEmployeeById(Integer employeeId);
}
