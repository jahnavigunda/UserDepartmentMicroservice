package com.microservice.departmentservice.service;

import com.microservice.departmentservice.controller.DepartmentController;
import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    private static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);

    public Department saveDepartment(Department department) {
        logger.info("Inside Save Department of Department Service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        logger.info("Inside findDepartmentById  method of DepartmentController");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
