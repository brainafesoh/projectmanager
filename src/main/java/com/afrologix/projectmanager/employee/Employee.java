package com.afrologix.projectmanager.employee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * Employee
 */
public class Employee implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // will be set when persisting

	private String firstName;
	private String lastName;
	private String email;
	private String tel;
	private String title;
	private Date hiringDate;

	public Employee(String firstName, String lastName, String email, String tel, String title, Date hiringDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.tel = tel;
		this.title = title;
		this.hiringDate = hiringDate;
	}
}