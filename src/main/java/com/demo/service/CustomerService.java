package com.demo.service;

import java.util.List;

import com.demo.model.Customer;

//Interface for customer service with CRUD operations
public interface CustomerService {
	
	// Method to save a customer
    // Takes a Customer object as a parameter and returns the saved Customer
	Customer save(Customer c);
	 // Method to retrieve all customers
    // Returns a list of Customer objects
	List<Customer> findAll();
	 // Method to delete a customer by their ID
    // Takes an integer ID as a parameter and returns an integer indicating the result of the operation
	int deleteById(int id);
	 // Method to find a customer by their ID
    // Takes an integer ID as a parameter and returns the Customer object if found
	Customer findById(int id);
}
