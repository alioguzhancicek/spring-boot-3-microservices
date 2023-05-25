package com.alioguzhancicek.departmentservice.client;

import com.alioguzhancicek.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/employee/department/{departmentId}")
    List<Employee> getByDepartment(@PathVariable("departmentId") Long departmentId);
}
