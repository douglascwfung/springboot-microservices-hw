package net.icestone.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.icestone.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}