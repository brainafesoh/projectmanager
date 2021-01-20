package com.afrologix.projectmanager.company;

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
@RequestMapping("/api/company")
/**
 * CompanyController
 */
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping
	public List<CompanyModel> findAllCompanies() {
		return companyService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CompanyModel create(@RequestBody CompanyModel companyModel) {
		return companyService.createNewCompany(companyModel);
	}

	@GetMapping("/{id}")
	public Optional<CompanyModel> findOne(@PathVariable Long id) {
		return companyService.findCompany(id);
	}

	@DeleteMapping("/{id}")
	public Optional<CompanyModel> delete(@PathVariable Long id) {
		return companyService.deleteCompany(id);
	}

}