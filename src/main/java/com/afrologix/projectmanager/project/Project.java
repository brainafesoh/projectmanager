package com.afrologix.projectmanager.project;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.afrologix.projectmanager.company.Company;
import com.afrologix.projectmanager.contact.Contact;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * Project
 */
public class Project implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // will be set when persisting

	@ManyToOne
	private Company company;

	@ManyToOne
	private Contact contact;

	private String name;
	private String type;
	private String budget;
	private Date startDate;
	private Date endDate;

	public Project(Company company, Contact contact, String name, String type, String budget,
			Date startDate, Date endDate) {
		this.company = company;
		this.contact = contact;
		this.name = name;
		this.type = type;
		this.budget = budget;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}