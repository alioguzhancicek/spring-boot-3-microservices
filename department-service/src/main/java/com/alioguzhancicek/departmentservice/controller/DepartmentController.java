package com.alioguzhancicek.departmentservice.controller;

import com.alioguzhancicek.departmentservice.model.Department;
import com.alioguzhancicek.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public Department save(@RequestBody Department department) {
        log.info("Department add: {}", department);
        return departmentService.save(department);
    }

    @GetMapping
    public List<Department> getAll() {
        log.info("Department find");
        return departmentService.getAll().stream().toList();
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable Long id) {
        log.info("Department find: id={}", id);
        return departmentService.get(id);
    }
}
