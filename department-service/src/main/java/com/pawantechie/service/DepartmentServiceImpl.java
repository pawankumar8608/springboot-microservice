package com.pawantechie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pawantechie.entity.Department;
import com.pawantechie.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment() method of DepartmentService");
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(Long deptId) {
		log.info("Inside getDepartmentById() method of DepartmentService");
		return departmentRepository.findByDeptId(deptId);
	}

}
