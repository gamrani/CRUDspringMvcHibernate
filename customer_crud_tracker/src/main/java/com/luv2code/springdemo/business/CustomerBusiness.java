package com.luv2code.springdemo.business;

import java.util.*;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerBusiness {

	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer c);
	public Customer getCustomer(int theId);
	public void delete(int theId);

}
