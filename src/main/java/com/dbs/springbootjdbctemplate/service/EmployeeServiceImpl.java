package com.dbs.springbootjdbctemplate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.repository.EmployeeRepository;


@Service
@Scope() // prototype scope will give different object
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee deleteEmployee(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		List <Employee> list = employeeRepository.findAll();
		if(list.isEmpty()) {
			return Optional.empty();
		}
		else {
			return Optional.of(list);
		}
		
	}

	@Override
	public Optional<List<Employee>> getEmpByLastName(String LastName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmpLastName(LastName);
	}

	@Override
	public Employee getEmpbyIdandLastName(int empId, String LastName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmpIdAndEmpLastName(empId, LastName);
	}
	

	
	

}
