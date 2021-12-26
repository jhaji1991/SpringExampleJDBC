package com.java.program.service;

import com.java.program.dao.EmployeeDAO;
import com.java.program.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;


	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void createEmployee(Employee employee) {
		getEmployeeDao().createEmployee(employee);

	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		
		return getEmployeeDao().fetchEmployeeById(employeeId);
	}

}
