package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

//Marks this class as a Spring MVC controller
@Controller
public class CustomerController {
	// Automatically injects an instance of CustomerService
	@Autowired
	private CustomerService cs;
	
	// Handles GET requests to the root URL ("/")
	@GetMapping(value = "/")
	public ModelAndView m1(ModelAndView m)
	{
		// Sets the view name to "index" and returns the ModelAndView object
		m.setViewName("index");
		return m;
	}
	// Handles GET requests to "/req1" and "/AddCustomer" URLs
	@GetMapping(value = {"/req1","/AddCustomer"})
	public ModelAndView m2(ModelAndView m)
	{
		// Adds a list of all customers to the ModelAndView object
		m.addObject("customers", cs.findAll());
		// Sets the view name to "AddCustomer" and returns the ModelAndView object
		m.setViewName("AddCustomer");
		return m;
	}
	// Handles POST requests to "/req2" URL
	@PostMapping(value = "/req2")
	public ModelAndView m3(Customer c, String b1, ModelAndView m)
	{
		// Checks the value of the button (b1) and performs the corresponding action
		if(b1.equalsIgnoreCase("Add"))
		{
			// Adds the customer to the database
			c=cs.save(c);
			 // If customer is not added, refresh the customer list
			if(c==null)
				m2(m);
			else {
				// Otherwise, show a success message and refresh the customer list
				m.addObject("status","Record Added Successfully");
				m2(m);
			}
		}
		if(b1.equalsIgnoreCase("Delete"))
		{
			// Deletes the customer by ID
			int check=cs.deleteById(c.getId());
			// If delete is successful, show a success message
			if(check!=0)
				m.addObject("status", "Record deleted sucessfully");
			// Refresh the customer list
			m2(m);
			
		}
		if(b1.equalsIgnoreCase("View"))
		{
			// Finds the customer by ID
			c=cs.findById(c.getId());
			// If customer is found, add it to the ModelAndView object and set the view name to "next"
			if(c!=null)
			{
				m.addObject("customer", c);
				m.setViewName("next");
			}
			else {
				// Otherwise, refresh the customer list
				m2(m);
			}
		}
		if(b1.equalsIgnoreCase("Edit"))
		{
			// Updates the customer in the database
			c=cs.save(c);
			 // If update is not successful, refresh the customer list
			if(c==null)
				m2(m);
			else {
				// Otherwise, show a success message and refresh the customer list
				m.addObject("status","Record Edited Successfully");
				m2(m);
			}
		}
		// Returns the ModelAndView object
		return m;
	}
}
