package com.afrologix.projectmanager.timeSheet;

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
@RequestMapping("/api/timeSheet")
/**
 * TimeSheetController
 */
public class TimeSheetController {

	@Autowired
	private TimeSheetService TimeSheetService;

	@GetMapping
	public List<TimeSheetModel> findAllCompanies() {
		return TimeSheetService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TimeSheetModel create(@RequestBody TimeSheetModel TimeSheetModel) {
		return TimeSheetService.createNewTimeSheet(TimeSheetModel);
	}

	@GetMapping("/{id}")
	public Optional<TimeSheetModel> findOne(@PathVariable Long id) {
		return TimeSheetService.findTimeSheet(id);
	}

	@DeleteMapping("/{id}")
	public Optional<TimeSheetModel> delete(@PathVariable Long id) {
		return TimeSheetService.deleteTimeSheet(id);
	}

}