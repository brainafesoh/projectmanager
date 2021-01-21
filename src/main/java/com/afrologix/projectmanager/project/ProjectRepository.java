package com.afrologix.projectmanager.project;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ProjectRepository
 */
public interface ProjectRepository extends JpaRepository<ProjectModel, Long> {
	
}