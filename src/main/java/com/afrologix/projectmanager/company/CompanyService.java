package com.afrologix.projectmanager.company;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public Page<Company> findAll(Pageable pageable) {
		return companyRepository.findAll(pageable);
	}

	public Company createNewCompany(Company company) {
		return companyRepository.save(company);
	}

	public Optional<Company> findCompany(Long id) {
		return companyRepository.findById(id);
	}

	public void deleteCompany(Long id) {
		companyRepository.deleteById(id);
	}
}