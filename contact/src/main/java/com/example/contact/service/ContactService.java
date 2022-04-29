package com.example.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.contact.model.Contact;
import com.example.contact.model.ContactOrganization;
import com.example.contact.model.ContactPerson;
import com.example.contact.repository.ContactRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

	@Autowired
	ContactRepository conRepository;

	// CREATE
	public Contact createContactPerson(ContactPerson con) {

		return conRepository.save(con);
	}

	public Contact createContactOrganization(ContactOrganization org) {

		return conRepository.save(org);
	}

	// READ(All Contacts)
	public List<Contact> getContact() {
		return conRepository.findAll();
	}

	// READ(Contacts By Id)
	public Optional<Contact> getContact(Long id) {
		return conRepository.findById(id);
	}

	// UPDATE(Person By Replace)
	/*
	 * public Contact updateContact(Long contact_id, Contact contactDetails, Contact
	 * contactPerson) {
	 * Contact con = conRepository.findById(contact_id).get();
	 * con.setName(contactDetails.getName());
	 * con.setPhoneNumber(contactDetails.getPhoneNumber());
	 * con.setDateTime(contactDetails.getDateTime());
	 * con.setEmail(contactDetails.getClass
	 * con.setDateOfBirth(contactDetails.getDateOfBirth());
	 * 
	 * return conRepository.save(con);
	 * }
	 * 
	 * // UPDATE(Person By Modify)
	 * public Contact updateContact(Long contact_id, Contact ContactDetails) {
	 * Contact con = conRepository.findById(contact_id).get();
	 * con.setName(ContactDetails.getName());
	 * con.setPhoneNumber(ContactDetails.getPhoneNumber());
	 * con.setDateTime(ContactDetails.getDateTime());
	 * 
	 * return conRepository.save(con);
	 * }
	 * 
	 * //UPDATE(Organization)
	 * public Contact updateContact(Long contact_id, Contact ContactDetails) {
	 * Contact con = conRepository.findById(contact_id).get();
	 * con.setName(ContactDetails.getName());
	 * con.setPhoneNumber(ContactDetails.getPhoneNumber());
	 * con.setDateTime(ContactDetails.getDateTime());
	 * 
	 * return conRepository.save(con);
	 * }
	 * 
	 * //UPDATE(Organization)
	 * public Contact updateContact(Long contact_id, Contact ContactDetails) {
	 * Contact con = conRepository.findById(contact_id).get();
	 * con.setName(ContactDetails.getName());
	 * con.setPhoneNumber(ContactDetails.getPhoneNumber());
	 * con.setDateTime(ContactDetails.getDateTime());
	 * 
	 * return conRepository.save(con);
	 * }
	 */
	//

	// DELETE
	public void deleteContact(Long contact_id) {
		conRepository.deleteById(contact_id);
	}

}
