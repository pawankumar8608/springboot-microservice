package com.pawantechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pawantechie.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	public Department findByDeptId(Long deptId);

}
