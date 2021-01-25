package com.afrologix.projectmanager.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CompanyRepository
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}