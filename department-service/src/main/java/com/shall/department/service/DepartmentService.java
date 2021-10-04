package com.shall.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shall.department.entity.Department;
import com.shall.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("DepartmentService.saveDepartment -> Start");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("DepartmentService.findDepartmentById -> Start");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
