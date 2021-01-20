package com.afrologix.projectmanager.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<CompanyModel> findAllCompanies() {
		return companyService.findAll();
	}

}