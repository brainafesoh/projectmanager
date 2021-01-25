package com.afrologix.projectmanager.timeSheet;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.afrologix.projectmanager.project.Project;
import com.afrologix.projectmanager.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * TimeSheet
 */
public class TimeSheet implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // will be set when persisting

	@ManyToOne
	private Project project;

	@ManyToOne
	private User user;

	private String activity;
	private Date startTime;
	private Date endTime;
	private Boolean isAdditionalHour;

	public TimeSheet(Project project, User user, String activity, Date startTime, Date endTime,
			Boolean isAdditionalHour) {
		this.project = project;
		this.user = user;
		this.activity = activity;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isAdditionalHour = isAdditionalHour;
	}
}