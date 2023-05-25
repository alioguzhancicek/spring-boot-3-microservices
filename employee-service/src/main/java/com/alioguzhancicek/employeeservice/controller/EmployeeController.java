package com.alioguzhancicek.employeeservice.controller;

import com.alioguzhancicek.employeeservice.model.Employee;
import com.alioguzhancicek.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        log.info("Employee add: {}", employee);
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        log.info("Employee find");
        return employeeService.getAll().stream().toList();
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable Long id) {
        log.info("Employee find: id={}", id);
        return employeeService.get(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> getByDepartment(@PathVariable("departmentId") Long departmentId) {
        log.info("Employee find: departmentId={}", departmentId);
        return employeeService.getByDepartment(departmentId).stream().toList();
    }
}
