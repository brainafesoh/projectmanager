package com.afrologix.projectmanager.company;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CompanyRepository
 */
public interface CompanyRepository extends JpaRepository<CompanyModel, UUID> {

}