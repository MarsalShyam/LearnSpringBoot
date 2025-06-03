package com.postgreLearn.postgrelearn.repository;

import com.postgreLearn.postgrelearn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
