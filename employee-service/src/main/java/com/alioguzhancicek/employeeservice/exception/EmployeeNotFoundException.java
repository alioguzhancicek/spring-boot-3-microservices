package com.alioguzhancicek.employeeservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmployeeNotFoundException extends RuntimeException {
    private String message;
}
