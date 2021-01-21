package com.afrologix.projectmanager.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
/**
 * ProjectController
 */
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GetMapping
	public List<ProjectModel> findAllCompanies() {
		return projectService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProjectModel create(@RequestBody ProjectModel projectModel) {
		return projectService.createNewProject(projectModel);
	}

	@GetMapping("/{id}")
	public Optional<ProjectModel> findOne(@PathVariable Long id) {
		return projectService.findProject(id);
	}

	@DeleteMapping("/{id}")
	public Optional<ProjectModel> delete(@PathVariable Long id) {
		return projectService.deleteProject(id);
	}

}