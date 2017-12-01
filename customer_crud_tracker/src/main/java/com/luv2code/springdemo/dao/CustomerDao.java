package com.luv2code.springdemo.dao;

import java.util.ArrayList;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;



public interface CustomerDao {

	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer c);
	public Customer getCustomer(int theId);
	public void delete(int theId);

}
