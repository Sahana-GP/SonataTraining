package com.sonata.repository;

//import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Employee;

@Repository
//@ComponentScan({"com.sonata.controller"})
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
