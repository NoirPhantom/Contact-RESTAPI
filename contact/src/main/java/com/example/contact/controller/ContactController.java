package com.example.contact.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.contact.model.Contact;
import com.example.contact.model.ContactOrganization;
import com.example.contact.model.ContactPerson;
import com.example.contact.service.ContactService;

@RestController
@RequestMapping("/phone_book")
public class ContactController {

    @Autowired
    ContactService ContactService;

    @PostMapping("/person/contact_id")
    public Contact createContactPerson(@RequestBody ContactPerson person) {
        return ContactService.createContactPerson(person);
    }

    @PostMapping("/organization/contact_id")
    public Contact createContactOrganization(@RequestBody ContactOrganization organization) {
        return ContactService.createContactOrganization(organization);
    }

    @GetMapping("/contact_id")
    public List<Contact> readContact() {
        return ContactService.getContact();
    }

    @GetMapping("/contact/{contact_id}")
    public Optional<Contact> getContact(@PathVariable(value = "contact_id") Long id) {
        return ContactService.getContact(id);
    }

    @DeleteMapping("/contact/{contact_id}")
    public void deleteContact(@PathVariable(value = "contact_id") Long id) {
        ContactService.deleteContact(id);
    }

}
