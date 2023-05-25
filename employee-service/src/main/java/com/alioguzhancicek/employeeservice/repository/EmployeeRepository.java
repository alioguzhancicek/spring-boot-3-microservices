package com.alioguzhancicek.employeeservice.repository;

import com.alioguzhancicek.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Collection<Employee> findAllByDepartmentId(Long departmentId);
}
