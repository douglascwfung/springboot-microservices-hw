package net.icestone.employeeservice.service;

import net.icestone.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    
    EmployeeDto getEmployeeById(Long employeeId);
 
}