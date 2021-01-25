package com.afrologix.projectmanager.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
/**
 * EmployeeController
 */
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public List<Employee> findAllCompanies() {
		return employeeService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee create(@RequestBody Employee employee) {
		return employeeService.createNewEmployee(employee);
	}

	@GetMapping("/{id}")
	public Optional<Employee> findOne(@PathVariable Long id) {
		return employeeService.findEmployee(id);
	}

	@DeleteMapping("/{id}")
	public Optional<Employee> delete(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}

}