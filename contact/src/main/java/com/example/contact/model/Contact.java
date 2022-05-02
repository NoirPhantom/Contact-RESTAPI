package com.example.contact.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone_book")
@DiscriminatorColumn(name = "contactType")
public class Contact {
	@Column(insertable = false, updatable = false)
	protected String contactType;

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id")
    protected Long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "phone_number")
    protected String phoneNumber;

    @Column
    protected LocalDateTime dateTime;

    public Contact() {
    }

	public Contact(String contactType, Long id, String name, String phoneNumber, LocalDateTime dateTime) {
		super();
		this.contactType = contactType;
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateTime = LocalDateTime.now();
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Contact [contactType=" + contactType + ", id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", dateTime=" + dateTime + "]";
	}




}
