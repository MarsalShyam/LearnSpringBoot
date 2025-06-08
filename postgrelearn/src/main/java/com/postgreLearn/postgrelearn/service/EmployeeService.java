package com.postgreLearn.postgrelearn.service;

import com.postgreLearn.postgrelearn.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}
