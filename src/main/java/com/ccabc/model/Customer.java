package com.ccabc.model;

import java.time.LocalDate;

public class Customer {

    private int id;
    private String name;
    private long contact;
    private String accountType; // BASIC, PREMIUM, GOLD
    private LocalDate accountCreationDate;

    public Customer() {
    }

    public Customer(int id, String name, long contact, String accountType, LocalDate accountCreationDate) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.accountType = accountType;
        this.accountCreationDate = accountCreationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", accountType='" + accountType + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }
}
