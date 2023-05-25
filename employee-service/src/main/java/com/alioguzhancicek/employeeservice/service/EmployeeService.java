package com.alioguzhancicek.employeeservice.service;

import com.alioguzhancicek.employeeservice.exception.EmployeeNotFoundException;
import com.alioguzhancicek.employeeservice.model.Employee;
import com.alioguzhancicek.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee get(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id:" + id));
    }

    public Collection<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
