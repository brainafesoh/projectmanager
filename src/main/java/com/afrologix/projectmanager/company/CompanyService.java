package com.afrologix.projectmanager.company;

import java.util.List;
import java.util.Optional;

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

	public CompanyModel createNewCompany(CompanyModel companyModel) {
		return companyRepository.save(companyModel);
	}

	public Optional<CompanyModel> findCompany(Long id) {
		return companyRepository.findById(id);
	}

	public Optional<CompanyModel> deleteCompany(Long id) {
		Optional<CompanyModel> companyModel = companyRepository.findById(id);
		companyRepository.deleteById(id);
		return companyModel;
	}
}