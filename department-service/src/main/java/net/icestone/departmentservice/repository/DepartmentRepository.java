package net.icestone.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.icestone.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}