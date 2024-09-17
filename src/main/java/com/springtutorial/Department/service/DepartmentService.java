package com.springtutorial.Department.service;

import com.springtutorial.Department.entity.Department;

import java.util.List;

public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);
    // Read Operation
    List<Department> fetchDepartmentList();
    // Update Operation
    Department updateDepartment(Department department,int departmentId);
    // Delete Operation
    void deleteDepartmentById(int departmentId);
}
