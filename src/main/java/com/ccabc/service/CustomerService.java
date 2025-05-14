package com.ccabc.service;

import com.ccabc.model.Customer;

import java.util.List;

public interface CustomerService {
//    WHAT

    public void addCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(int id);
    public String deleteCustomer(int id);

}
