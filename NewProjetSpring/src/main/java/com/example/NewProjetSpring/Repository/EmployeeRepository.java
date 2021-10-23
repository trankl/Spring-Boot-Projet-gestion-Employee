package com.example.NewProjetSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.NewProjetSpring.Model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
