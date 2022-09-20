package com.sonata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Employee;
import com.sonata.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	//Optional<Employee> e1;
	@Autowired
	private EmployeeRepository emprepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return emprepository.findAll();
	}
	
	
	
}
