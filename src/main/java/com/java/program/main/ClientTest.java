package com.java.program.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.program.collectiondata.CollectionInfo;
import com.java.program.model.Address;
import com.java.program.model.Employee;
import com.java.program.service.EmployeeService;
import com.java.program.service.EmployeeServiceImpl;

public class ClientTest {
	public static void main(String[] args) {

		// ApplicationContext
		ApplicationContext applicationContext = null;
		try {
			applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

			EmployeeService employeeService = (EmployeeService) applicationContext.getBean(EmployeeServiceImpl.class);
			createEmployee(employeeService);
			Employee employeeById = employeeService.getEmployeeById(1);
			System.out.println(employeeById);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (applicationContext != null)
				((AbstractApplicationContext) applicationContext).close();
		}

	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = getEmployee();
		employeeService.createEmployee(employee);
	}

	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Deepak Jha");
		employee.setEmail("deepak@gmail.com");
		employee.setSalary(200000d);
		return employee;
	}

}
