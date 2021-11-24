package com.dbs.springbootjdbctemplate.dto;

import java.io.Serializable;
import java.lang.annotation.Repeatable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employeetbl1")
public class Employee implements Serializable {
	
	@Id
	@Column(name = "emp_id1")
	private int empId;
	@Column(name = "emp_firstname")
	private String empFirstName;
	@Column(name = "emp_lastname")
	private String empLastName;
	private String address;
	
	private float empSalary;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "deptId")
	private Department department;
	

}
