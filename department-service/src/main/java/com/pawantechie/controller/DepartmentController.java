package com.pawantechie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pawantechie.entity.Department;
import com.pawantechie.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment() method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long deptId) {
		log.info("Inside getDepartmentById() method of DepartmentController");
		return departmentService.getDepartmentById(deptId);
	}

}
