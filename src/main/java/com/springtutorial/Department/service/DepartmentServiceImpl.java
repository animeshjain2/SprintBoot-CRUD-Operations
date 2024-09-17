package com.springtutorial.Department.service;

import com.springtutorial.Department.entity.Department;
import com.springtutorial.Department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, int departmentId) {
        Department ob = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()))
        {
            ob.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress()))
        {
            ob.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentCode()))
        {
            ob.setDepartmentCode(department.getDepartmentCode());
        }


        departmentRepository.save(ob);

        return ob;
    }

    @Override
    public void deleteDepartmentById(int departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
