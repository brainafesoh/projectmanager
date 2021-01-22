package com.afrologix.projectmanager.company;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.URL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor // Default constructor: doesn't take any parameters
@AllArgsConstructor // Constructor that takes all parameters
/**
 * CompanyModel
 */
public class CompanyModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // will be set when persisting

	@Size(min = 3, max = 60)
	@Column(nullable = false, name = "name") // Configure specific details for the column in DB
	private String name;

	@Email
	private String email;

	@JsonIgnore // To hide the given field when you retrieve data from the DB
	private String tel;

	@URL
	private String website;

}