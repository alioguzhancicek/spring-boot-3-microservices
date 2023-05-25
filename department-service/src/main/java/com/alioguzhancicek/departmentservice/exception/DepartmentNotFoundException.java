package com.alioguzhancicek.departmentservice.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DepartmentNotFoundException extends RuntimeException {
    private String message;
}
