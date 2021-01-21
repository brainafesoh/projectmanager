package com.afrologix.projectmanager.contact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
/**
 * ContactController
 */
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping
	public List<ContactModel> findAllCompanies() {
		return contactService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ContactModel create(@RequestBody ContactModel contactModel) {
		return contactService.createNewContact(contactModel);
	}

	@GetMapping("/{id}")
	public Optional<ContactModel> findOne(@PathVariable Long id) {
		return contactService.findContact(id);
	}

	@DeleteMapping("/{id}")
	public Optional<ContactModel> delete(@PathVariable Long id) {
		return contactService.deleteContact(id);
	}

}