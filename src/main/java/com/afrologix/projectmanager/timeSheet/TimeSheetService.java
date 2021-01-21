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

	public List<TimeSheetModel> findAll() {
		return TimeSheetRepository.findAll();
	}

	public TimeSheetModel createNewTimeSheet(TimeSheetModel TimeSheetModel) {
		return TimeSheetRepository.save(TimeSheetModel);
	}

	public Optional<TimeSheetModel> findTimeSheet(Long id) {
		return TimeSheetRepository.findById(id);
	}

	public Optional<TimeSheetModel> deleteTimeSheet(Long id) {
		Optional<TimeSheetModel> TimeSheetModel = TimeSheetRepository.findById(id);
		TimeSheetRepository.deleteById(id);
		return TimeSheetModel;
	}
}