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

	public List<ProjectModel> findAll() {
		return projectRepository.findAll();
	}

	public ProjectModel createNewProject(ProjectModel projectModel) {
		return projectRepository.save(projectModel);
	}

	public Optional<ProjectModel> findProject(Long id) {
		return projectRepository.findById(id);
	}

	public Optional<ProjectModel> deleteProject(Long id) {
		Optional<ProjectModel> projectModel = projectRepository.findById(id);
		projectRepository.deleteById(id);
		return projectModel;
	}
}