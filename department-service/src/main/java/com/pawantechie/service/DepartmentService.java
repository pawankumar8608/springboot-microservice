package com.pawantechie.service;

import com.pawantechie.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department department);
	
	public Department getDepartmentById(Long deptId);

}
