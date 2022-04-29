package com.example.contact.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone_book")
public class Contact {

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

    public Contact(Long id, String name, String phoneNumber, LocalDateTime dateTime) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateTime = dateTime;
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
        return "Contact [dateTime = " + dateTime + ", id = " + id + ", name = " + name + ", phoneNumber = "
                + phoneNumber + "]";
    }


}
