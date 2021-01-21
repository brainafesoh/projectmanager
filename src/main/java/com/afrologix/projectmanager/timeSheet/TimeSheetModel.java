package com.afrologix.projectmanager.timeSheet;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.afrologix.projectmanager.project.ProjectModel;
import com.afrologix.projectmanager.user.UserModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * TimeSheetModel
 */
public class TimeSheetModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // will be set when persisting

	@ManyToOne
	private ProjectModel projectModel;

	@ManyToOne
	private UserModel userModel;

	private String activity;
	private Date startTime;
	private Date endTime;
	private Boolean isAdditionalHour;

	public TimeSheetModel(ProjectModel projectModel, UserModel userModel, String activity, Date startTime, Date endTime,
			Boolean isAdditionalHour) {
		this.projectModel = projectModel;
		this.userModel = userModel;
		this.activity = activity;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isAdditionalHour = isAdditionalHour;
	}
}