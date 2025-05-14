package com.ccabc.config;


import com.ccabc.repository.CustomerRepository;
import com.ccabc.repository.CustomerRepositoryListImpl;
import com.ccabc.repository.CustomerRepositoryNewListImpl;
import com.ccabc.service.CustomerService;
import com.ccabc.service.CustomerServiceListImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

//    I will declare my beans [which service, which repository to use]

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
//        CustomerRepository customerRepository=new CustomerRepositoryListImpl();
        CustomerRepository customerRepository=new CustomerRepositoryNewListImpl();
        return  customerRepository;
    }

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceListImpl customerService=new CustomerServiceListImpl();
        //customer service needs to be linked to customer repository
        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
    }
}
