package com.luv2code.springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImplementation implements CustomerDao {
	@Autowired
	private SessionFactory session;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Customer order by firstName").list();
	}

	@Override
	public void saveCustomer(Customer c) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(c);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return (Customer) session.getCurrentSession().get(Customer.class,theId);
	}

	@Override
	public void delete(int theId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getCustomer(theId));
		
	}
	
	
}
