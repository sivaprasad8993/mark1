package com.example.mark1.service;

import com.example.mark1.dto.EmployeeDto;
import com.example.mark1.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
