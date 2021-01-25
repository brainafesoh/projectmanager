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
	public List<Contact> findAllCompanies() {
		return contactService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contact create(@RequestBody Contact contact) {
		return contactService.createNewContact(contact);
	}

	@GetMapping("/{id}")
	public Optional<Contact> findOne(@PathVariable Long id) {
		return contactService.findContact(id);
	}

	@DeleteMapping("/{id}")
	public Optional<Contact> delete(@PathVariable Long id) {
		return contactService.deleteContact(id);
	}

}