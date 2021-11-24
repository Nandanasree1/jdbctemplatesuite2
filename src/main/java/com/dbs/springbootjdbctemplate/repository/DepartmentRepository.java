package com.dbs.springbootjdbctemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.springbootjdbctemplate.dto.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

}
