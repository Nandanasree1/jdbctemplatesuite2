package com.dbs.springbootjdbctemplate;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.service.DepartmentServive;
import com.dbs.springbootjdbctemplate.service.EmployeeService;

@SpringBootApplication
public class SpringbootJdbctemplateApplication {

	public static void main(String[] args) {
	ApplicationContext  applicationContext =SpringApplication.run(SpringbootJdbctemplateApplication.class, args);
	DataSource dataSource = applicationContext.getBean(DataSource.class);
	System.out.println(dataSource!=null);
	EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
	Department department = new Department("training","ab45","hyd",null);
	Employee employee = new Employee(1237,"nandana","sree","tirupathi",100.0f,department);
	
	//Optional<List<Employee>> employee2 = employeeService.getEmpByLastName("sandeep");
	//System.out.println(employee2);
	//Employee employee3 = employeeService.getEmpbyIdandLastName(1235, "sandeep");
	//System.out.println(employee3);
	DepartmentServive departmentServive = applicationContext.getBean(DepartmentServive.class);
	employeeService.createEmployee(employee);
	System.out.println(employee);
	}

}
