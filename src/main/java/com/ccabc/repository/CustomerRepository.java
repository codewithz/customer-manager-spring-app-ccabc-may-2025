package com.ccabc.repository;

import com.ccabc.model.Customer;

import java.util.List;

public interface CustomerRepository {

    public void addCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(int id);
    public String deleteCustomer(int id);
}
