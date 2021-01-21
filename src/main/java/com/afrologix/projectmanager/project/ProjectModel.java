package com.afrologix.projectmanager.project;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.afrologix.projectmanager.company.CompanyModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * ProjectModel
 */
public class ProjectModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id; // will be set when persisting

	@ManyToOne
	private CompanyModel companyModel;

	private String name;
	private String type;
	private String budget;
	private Date startDate;
	private Date endDate;

	public ProjectModel(CompanyModel companyModel, String name, String type, String budget, Date startDate,
			Date endDate) {
		this.companyModel = companyModel;
		this.name = name;
		this.type = type;
		this.budget = budget;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}