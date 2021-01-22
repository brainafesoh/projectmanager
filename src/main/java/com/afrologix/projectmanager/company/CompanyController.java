package com.afrologix.projectmanager.company;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ResponseEntity<List<CompanyModel>> findAllCompanies(Pageable pageable) {
		Page<CompanyModel> allCompanies = companyService.findAll(pageable);
		return new ResponseEntity<>(allCompanies.getContent(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CompanyModel> create(@RequestBody @Valid CompanyModel companyModel) {
		CompanyModel newCompanyModel = companyService.createNewCompany(companyModel);
		return new ResponseEntity<>(newCompanyModel, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public Optional<CompanyModel> findOne(@PathVariable Long id) {
		return companyService.findCompany(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		companyService.deleteCompany(id);
	}

	@PutMapping
	public ResponseEntity<CompanyModel> updateCompany(@RequestBody @Valid CompanyModel companyModel) {
		CompanyModel newCompanyModel = companyService.createNewCompany(companyModel);
		return new ResponseEntity<>(newCompanyModel, HttpStatus.OK);
	}

}