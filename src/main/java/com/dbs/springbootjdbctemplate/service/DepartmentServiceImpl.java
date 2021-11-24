package com.dbs.springbootjdbctemplate.service;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.dbs.springbootjdbctemplate.dto.Department;
	import com.dbs.springbootjdbctemplate.repository.DepartmentRepository;


	@Service
	public class DepartmentServiceImpl implements DepartmentServive {
		
		@Autowired
		DepartmentRepository departmentRepository;

		
		@Override
		public Department createDepartment(Department department) {
			// TODO Auto-generated method stub
			return departmentRepository.save(department);
		}

		
		@Override
		public Department deleteDepartment(String i) {
			// TODO Auto-generated method stub
			return null;
		}

	
		
		@Override
		public Department updateEmployee(String depId, Department department) {
			// TODO Auto-generated method stub
			return null;
		}

		
		@Override
		public Optional<Department> getDepartmentById(String depId) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Optional<List<Department>> getDepartments() {
			// TODO Auto-generated method stub
			return null;
		}

	}


