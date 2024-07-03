package com.example.mark1.service;

import com.example.mark1.dto.EmployeeDto;
import com.example.mark1.entity.Employee;
import com.example.mark1.mapper.EmployeeMapper;
import com.example.mark1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        if(employeeDto.getName().equals("Siva")){
            return new EmployeeDto("false","Invalid name"+employeeDto.getName());
        }
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee employee1 = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(employee1);
    }
}
