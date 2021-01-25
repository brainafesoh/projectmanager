package com.afrologix.projectmanager.contact;

import java.io.Serializable;

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
 * Contact
 */
public class Contact implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // will be set when persisting

	private String lastName;
	private String firstName;
	private String tel;
	private String email;
	private String title;

	public Contact(String lastName, String firstName, String tel, String email, String title) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.tel = tel;
		this.email = email;
		this.title = title;
	}
}