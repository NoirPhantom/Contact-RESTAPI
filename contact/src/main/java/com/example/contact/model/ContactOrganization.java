package com.example.contact.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "phone_book")
public class ContactOrganization extends Contact {

    @Column(name = "website")
    private String website;

    public ContactOrganization() {
    }
    public ContactOrganization(String contactType, Long id, String name, String phoneNumber, LocalDateTime dateTime,
    		String website) {
    	super(contactType, id, name, phoneNumber, dateTime);
    	this.website = website;
    }

    public String getWebsite() {
        return website;
    }




	public void setWebsite(String website) {
        this.website = website;
    }
	@Override
	public String toString() {
		return "ContactOrganization [contactType=" + contactType + "website=" + website + ", id=" + id + ", name=" + name + ", phoneNumber="
				+ phoneNumber + ", dateTime=" + dateTime + "]";
	}


    

}
