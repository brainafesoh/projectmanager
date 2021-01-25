package com.afrologix.projectmanager.timeSheet;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * TimeSheetService
 */
@Service
public class TimeSheetService {

	private TimeSheetRepository TimeSheetRepository;

	public TimeSheetService(TimeSheetRepository TimeSheetRepository) {
		this.TimeSheetRepository = TimeSheetRepository;
	}

	public List<TimeSheet> findAll() {
		return TimeSheetRepository.findAll();
	}

	public TimeSheet createNewTimeSheet(TimeSheet TimeSheet) {
		return TimeSheetRepository.save(TimeSheet);
	}

	public Optional<TimeSheet> findTimeSheet(Long id) {
		return TimeSheetRepository.findById(id);
	}

	public Optional<TimeSheet> deleteTimeSheet(Long id) {
		Optional<TimeSheet> TimeSheet = TimeSheetRepository.findById(id);
		TimeSheetRepository.deleteById(id);
		return TimeSheet;
	}
}