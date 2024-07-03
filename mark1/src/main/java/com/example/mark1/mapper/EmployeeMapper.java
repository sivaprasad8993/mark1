package com.example.mark1.mapper;

import com.example.mark1.dto.EmployeeDto;
import com.example.mark1.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getName(), employee.getDepartment());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getName(), employeeDto.getDepartment());
    }

}
