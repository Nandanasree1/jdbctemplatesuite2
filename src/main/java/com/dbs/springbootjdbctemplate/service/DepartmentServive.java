package com.dbs.springbootjdbctemplate.service;

import java.util.List;
import java.util.Optional;

import com.dbs.springbootjdbctemplate.dto.Department;

public interface DepartmentServive {

	Department createDepartment(Department department);

	Department deleteDepartment(String i);

	Department updateEmployee(String depId, Department department);

	Optional<List<Department>> getDepartments();

	Optional<Department> getDepartmentById(String depId);

}
