package com.java.program.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.program.model.Employee;
import com.mysql.cj.exceptions.RSAException;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(resultSet.getInt("employee_id"));
		employee.setEmployeeName(resultSet.getString("employee_name"));
		employee.setEmail(resultSet.getString("email"));
		employee.setSalary(resultSet.getDouble("salary"));
		return employee;
	}
	

}
