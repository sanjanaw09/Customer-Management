package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;

// Marks this class as a Spring service component and enables transaction management
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    
    // Automatically injects an instance of CustomerDao
    @Autowired
    private CustomerDao cd;

    // Saves a customer by delegating to the CustomerDao's save method
    @Override
    public Customer save(Customer c) {
        // Calls the save method in CustomerDao and returns the result
        return cd.save(c);
    }

    // Retrieves all customers by delegating to the CustomerDao's findAll method
    @Override
    public List<Customer> findAll() {
        // Calls the findAll method in CustomerDao and returns the result
        return cd.findAll();
    }

    // Deletes a customer by their ID by delegating to the CustomerDao's deleteById method
    @Override
    public int deleteById(int id) {
        // Calls the deleteById method in CustomerDao and returns the result
        return cd.deleteById(id);
    }

    // Finds a customer by their ID by delegating to the CustomerDao's findById method
    @Override
    public Customer findById(int id) {
        // Calls the findById method in CustomerDao and returns the result
        return cd.findById(id);
    }
}
