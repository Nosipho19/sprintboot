package com.example.demo.Repositories;

import com.api.employees.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.JpaRespository;
import org.springframework.stereotype.Repository;
import.org.springramework.sterotype.Repository


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{}

public interface EmployeesRespository {
}
