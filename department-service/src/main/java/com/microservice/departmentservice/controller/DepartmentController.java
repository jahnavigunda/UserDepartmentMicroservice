package com.microservice.departmentservice.controller;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {

        logger.info("Save Department of Department Service");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId) {
        logger.info("findDepartmentById  method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
