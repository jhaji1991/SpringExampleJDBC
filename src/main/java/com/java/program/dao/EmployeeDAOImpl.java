package com.java.program.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.java.program.mapper.EmployeeRowMapper;
import com.java.program.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createEmployee(Employee employee) {
		String _SQL = "insert into employee_table( employee_name, email, salary) values (?, ?, ?)";
		int update = getJdbcTemplate().update(_SQL, employee.getEmployeeName(), employee.getEmail(), employee.getSalary());
		if(update == 1) {
			System.out.println("Employee is created");
		}
	}

	@Override
	public Employee fetchEmployeeById(Integer employeeId) {
	    String _SQL = "select * from employee_table where employee_id = ?";
		return getJdbcTemplate().queryForObject(_SQL, new EmployeeRowMapper(), employeeId);
	}

}
