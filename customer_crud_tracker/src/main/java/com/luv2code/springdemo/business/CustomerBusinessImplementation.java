package com.luv2code.springdemo.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDao;
import com.luv2code.springdemo.entity.Customer;
@Service
public class CustomerBusinessImplementation implements CustomerBusiness {
    @Autowired
	private CustomerDao customerDao;
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> list = customerDao.getAllCustomers();
	
		return list;
	}
	@Override
	@Transactional
	public void saveCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(c);
		
	}
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(theId);
	}
	@Override
	@Transactional
	public void delete(int theId) {
		// TODO Auto-generated method stub
		customerDao.delete(theId);
		
	}



}
