package com.ccabc.controller;

import com.ccabc.model.Customer;
import com.ccabc.service.CustomerService;
import com.ccabc.service.CustomerServiceListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class CustomerController {
//    Responsible for checking incoming request and then calling appropriate controller

    //Controller is dependent on Service
//    [TIGHT COUPLING] -- a very bad implementation
//    CustomerService customerService=new CustomerServiceListImpl();

    CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void initiateApp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("------- Welcome to Coke B2B -- Console Manager -------");

        while(true){
            System.out.println("Please enter your choice");
            System.out.println("1 - Adding a new customer");
            System.out.println("2- Displaying All Customers");
            System.out.println("3- Searching a Customer");
            System.out.println("4- Deleting a Customer");
            System.out.println("5- Exiting the App");

            int option=sc.nextInt();

            switch (option){
                case 1:
//                    Accepting the customer details
                    System.out.print("Enter ID:");
                    int id=sc.nextInt();
                    System.out.print("Enter Name:");
                    String name=sc.next();
                    System.out.print("Enter Contact:");
                    long contact=sc.nextLong();
                    System.out.print("Enter Account Type [PREMIUM|GOLD|BASIC]:");
                    String accountType=sc.next();

                    Customer customer=new Customer(id,name,contact,accountType, LocalDate.now());
                    customerService.addCustomer(customer);
                    System.out.println("Customer Added Successfully");
                    break;
                case 2:
//                    Displaying all customers
                    List<Customer> customers=customerService.getAllCustomers();
                    for(Customer c:customers){
                            System.out.println(c);
                            System.out.println("---------------------------------------------------");
                    }
                    break;
                case 3:
//                    Search a customer
                    System.out.print("Enter ID for customer:");
                    int idForCustomerToBeSearched=sc.nextInt();
                    Customer c=customerService.getCustomerById(idForCustomerToBeSearched);
                    if(c!=null){
                        System.out.println(c);
                    }else{
                        System.out.println("Customer Not Found!!");
                    }

                    break;
                case 4:
//                    Delete a customer
                    System.out.print("Enter ID for customer:");
                    int idForCustomerToBeDeleted=sc.nextInt();
                    String status=customerService.deleteCustomer(idForCustomerToBeDeleted);
                    System.out.println(status);
                    break;
                case 5:
                    System.out.println("Thank You for using our service!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect Option Selected");
                    break;
            }

            System.out.println("____________________________________________________________________");


        }
    }

}
