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

	public Page<CompanyModel> findAll(Pageable pageable) {
		return companyRepository.findAll(pageable);
	}

	public CompanyModel createNewCompany(CompanyModel companyModel) {
		return companyRepository.save(companyModel);
	}

	public Optional<CompanyModel> findCompany(Long id) {
		return companyRepository.findById(id);
	}

	public void deleteCompany(Long id) {
		companyRepository.deleteById(id);
	}
}