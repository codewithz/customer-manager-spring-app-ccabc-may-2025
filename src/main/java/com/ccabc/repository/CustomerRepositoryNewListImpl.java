package com.ccabc.repository;

import com.ccabc.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryNewListImpl implements CustomerRepository {

    List<Customer> customers=new ArrayList<>();

    Customer c1 = new Customer(1006, "Sheldon", 998881, "GOLD", LocalDate.now());
    Customer c2 = new Customer(1007, "Leonard", 998882, "PREMIUM", LocalDate.now());
    Customer c3 = new Customer(1008, "Howard", 998883, "BASIC", LocalDate.now());
    Customer c4 = new Customer(1009, "Raj", 998884, "GOLD", LocalDate.now());
    Customer c5 = new Customer(1010, "Amy", 998885, "PREMIUM", LocalDate.now());

//    default block
{
    customers.add(c1);
    customers.add(c2);
    customers.add(c3);
    customers.add(c4);
    customers.add(c5);
}

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer=null;

        for(Customer c:customers){
            if(c.getId() == id){
                customer=c;
                break;
            }
        }

        return customer;
    }

    @Override
    public String deleteCustomer(int id) {
        String status="Customer Not Found";
        for(Customer c:customers){
            if(c.getId() == id){
                customers.remove(c);
                status="Customer Deleted Successfully!!";
                break;
            }
        }
        return status;
    }
}
