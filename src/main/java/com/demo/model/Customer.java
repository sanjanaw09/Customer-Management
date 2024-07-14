package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Marks this class as a JPA entity
@Entity
public class Customer {
    
    // Specifies the primary key of the entity
    @Id
    // Configures the way of increment of the specified column(field)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    // Fields representing customer details
    private String first_name;
    private String last_name;
    private String street;
    private String address;
    private String city;
    private String state;
    private String email;
    
    // Specifies the details of the column with a definition
    @Column(columnDefinition = "long(10)")
    private long phone;
    
    // Getter for 'id'
    public int getId() {
        return id;
    }
    
    // Setter for 'id'
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter for 'first_name'
    public String getFirst_name() {
        return first_name;
    }
    
    // Setter for 'first_name'
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    
    // Getter for 'last_name'
    public String getLast_name() {
        return last_name;
    }
    
    // Setter for 'last_name'
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    // Getter for 'street'
    public String getStreet() {
        return street;
    }
    
    // Setter for 'street'
    public void setStreet(String street) {
        this.street = street;
    }
    
    // Getter for 'address'
    public String getAddress() {
        return address;
    }
    
    // Setter for 'address'
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Getter for 'city'
    public String getCity() {
        return city;
    }
    
    // Setter for 'city'
    public void setCity(String city) {
        this.city = city;
    }
    
    // Getter for 'state'
    public String getState() {
        return state;
    }
    
    // Setter for 'state'
    public void setState(String state) {
        this.state = state;
    }
    
    // Getter for 'email'
    public String getEmail() {
        return email;
    }
    
    // Setter for 'email'
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Getter for 'phone'
    public long getPhone() {
        return phone;
    }
    
    // Setter for 'phone'
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    // Provides a string representation of the Customer object
    @Override
    public String toString() {
        return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", street=" + street
                + ", address=" + address + ", city=" + city + ", state=" + state + ", email=" + email + ", phone="
                + phone + "]";
    }
}
