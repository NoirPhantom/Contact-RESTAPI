package com.example.contact.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "phone_book")
public class ContactPerson extends Contact {

    @Column(name = "email")
    private String email;

    @Column(name = "D.O.B")
    private String dateOfBirth;

    public ContactPerson() {
    }



    public ContactPerson(String contactType, Long id, String name, String phoneNumber, LocalDateTime dateTime,
			String email, String dateOfBirth) {
		super(contactType, id, name, phoneNumber, dateTime);
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}



	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



	@Override
	public String toString() {
		return "ContactPerson [email=" + email + ", dateOfBirth=" + dateOfBirth + ", contactType=" + contactType
				+ ", id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", dateTime=" + dateTime + "]";
	}

 

}
