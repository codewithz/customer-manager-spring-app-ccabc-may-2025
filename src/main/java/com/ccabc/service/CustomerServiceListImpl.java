package com.ccabc.service;

import com.ccabc.model.Customer;
import com.ccabc.repository.CustomerRepository;
import com.ccabc.repository.CustomerRepositoryListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
@Service
public class CustomerServiceListImpl implements CustomerService{

//    Apply Business Logic

    //Service is dependent on CustomerRepository
//    [Tight Coupling] -- very bad implementation
//    CustomerRepository customerRepository=new CustomerRepositoryListImpl();
//    ProgrammingLanguage language=new Java();

    CustomerRepository customerRepository;

//    Setter Injection

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCustomer(Customer customer) {
        String accountType=customer.getAccountType().toUpperCase();
//        implementing validation -- Business Logic
        if(accountType.equals("PREMIUM")||accountType.equals("GOLD")||accountType.equals("BASIC")){
            customerRepository.addCustomer(customer);
        }else{
            System.out.println("Wrong Account Type Selected");
        }

    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public String deleteCustomer(int id) {
            return customerRepository.deleteCustomer(id);
    }
}
