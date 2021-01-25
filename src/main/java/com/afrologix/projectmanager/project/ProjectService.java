package com.afrologix.projectmanager.project;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * ProjectService
 */
@Service
public class ProjectService {

	private ProjectRepository projectRepository;

	public ProjectService(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	public List<Project> findAll() {
		return projectRepository.findAll();
	}

	public Project createNewProject(Project project) {
		return projectRepository.save(project);
	}

	public Optional<Project> findProject(Long id) {
		return projectRepository.findById(id);
	}

	public Optional<Project> deleteProject(Long id) {
		Optional<Project> project = projectRepository.findById(id);
		projectRepository.deleteById(id);
		return project;
	}
}