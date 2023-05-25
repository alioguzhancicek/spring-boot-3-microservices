package com.alioguzhancicek.departmentservice.service;

import com.alioguzhancicek.departmentservice.client.EmployeeClient;
import com.alioguzhancicek.departmentservice.exception.DepartmentNotFoundException;
import com.alioguzhancicek.departmentservice.model.Department;
import com.alioguzhancicek.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeClient employeeClient;

    public Department get(Long id) {
        return departmentRepository.findById(id).orElseThrow(() -> new DepartmentNotFoundException("Department not found with id:" + id));
    }

    public Collection<Department> getAll() {
        return departmentRepository.findAll();
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public void delete(Long id) {
        departmentRepository.deleteById(id);
    }

    public List<Department> getAllWithEmployees() {
        List<Department> departments = departmentRepository.findAll();
        departments.forEach(d -> d.setEmployees(employeeClient.getByDepartment(d.getId())));
        return departments;
    }
}
