package com.afrologix.projectmanager.company;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * CompanyService
 */
@Service
public class CompanyService {

	private CompanyRepository companyRepository;

	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public List<CompanyModel> findAll() {
		return companyRepository.findAll();
	}
}