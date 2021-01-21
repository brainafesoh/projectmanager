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

	public List<ContactModel> findAll() {
		return contactRepository.findAll();
	}

	public ContactModel createNewContact(ContactModel contactModel) {
		return contactRepository.save(contactModel);
	}

	public Optional<ContactModel> findContact(Long id) {
		return contactRepository.findById(id);
	}

	public Optional<ContactModel> deleteContact(Long id) {
		Optional<ContactModel> contactModel = contactRepository.findById(id);
		contactRepository.deleteById(id);
		return contactModel;
	}
}