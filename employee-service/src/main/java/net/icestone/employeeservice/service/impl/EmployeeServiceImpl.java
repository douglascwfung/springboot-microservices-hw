package net.icestone.employeeservice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.icestone.employeeservice.dto.EmployeeDto;
import net.icestone.employeeservice.entity.Employee;
import net.icestone.employeeservice.mapper.EmployeeMapper;
import net.icestone.employeeservice.repository.EmployeeRepository;
import net.icestone.employeeservice.service.EmployeeService;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee saveDEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(saveDEmployee);

        return savedEmployeeDto;
    }


	@Override
	public EmployeeDto getEmployeeById( Long employeeId) {
		
		Employee employee = employeeRepository.findById(employeeId).get();
		
		EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(employee);
		
		// TODO Auto-generated method stub
		return savedEmployeeDto;
	}


}
