package com.ccabc;

import com.ccabc.config.BeanConfig;
import com.ccabc.controller.CustomerController;
import com.ccabc.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

     // Create an application context using the BeanConfig class to manage Spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        // Retrieve the CustomerService bean from the application context
        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        // Create a new instance of CustomerController
        CustomerController customerController = new CustomerController();

        // Set the CustomerService dependency for the CustomerController
        customerController.setCustomerService(customerService);

        // Call the initiateApp method to start the application logic
        customerController.initiateApp();

    }
}
