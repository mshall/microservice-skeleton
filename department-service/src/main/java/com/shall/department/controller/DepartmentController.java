package com.shall.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shall.department.entity.Department;
import com.shall.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public Department saveDepartment(@RequestBody Department department) {
    	log.info("DepartmentController.saveDepartment -> Start");
        return  departmentService.saveDepartment(department);
    }

    @RequestMapping(value = "/{id}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("DepartmentController.findDepartmentById -> Start");
        return departmentService.findDepartmentById(departmentId);
    }

}
