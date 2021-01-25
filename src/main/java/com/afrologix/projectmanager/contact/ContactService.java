package com.afrologix.projectmanager.contact;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * ContactService
 */
@Service
public class ContactService {

	private ContactRepository contactRepository;

	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}

	public List<Contact> findAll() {
		return contactRepository.findAll();
	}

	public Contact createNewContact(Contact contact) {
		return contactRepository.save(contact);
	}

	public Optional<Contact> findContact(Long id) {
		return contactRepository.findById(id);
	}

	public Optional<Contact> deleteContact(Long id) {
		Optional<Contact> contact = contactRepository.findById(id);
		contactRepository.deleteById(id);
		return contact;
	}
}