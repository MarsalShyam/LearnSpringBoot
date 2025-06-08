package com.postgreLearn.postgrelearn.service.impl;

import com.postgreLearn.postgrelearn.dto.EmployeeDto;
import com.postgreLearn.postgrelearn.entity.Employee;
import com.postgreLearn.postgrelearn.exception.ResourceNotFoundException;
import com.postgreLearn.postgrelearn.mapper.EmployeeMapper;
import com.postgreLearn.postgrelearn.repository.EmployeeRepository;
import com.postgreLearn.postgrelearn.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->
                new ResourceNotFoundException("Employee is not exists with given id:"+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
