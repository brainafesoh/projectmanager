package com.afrologix.projectmanager.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee createNewEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Optional<Employee> findEmployee(Long id) {
		return employeeRepository.findById(id);
	}

	public Optional<Employee> deleteEmployee(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		employeeRepository.deleteById(id);
		return employee;
	}
}