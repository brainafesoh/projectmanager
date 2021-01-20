package com.afrologix.projectmanager.company;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * CompanyModel
 */
public class CompanyModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id; // will be set when persisting

	private String name;
	private String email;
	private String tel;
	private String website;

	public CompanyModel(String name, String email, String tel, String website) {
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.website = website;
	}
}