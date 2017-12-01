package com.luv2code.springdemo.controller;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.business.CustomerBusiness;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
	private CustomerBusiness customerBusiness;
    
    @RequestMapping("/registration")
    public String Registration() {
    	return"registration";
    }
    
    @RequestMapping(value="/list",method=RequestMethod.POST)
	public String showList(Model theModel) {
		theModel.addAttribute("customers",customerBusiness.getAllCustomers());
		return "list-customers";
	}
    @RequestMapping(value="/list",method=RequestMethod.GET)
	public String showListGet() {
		return "list-customers-error";
	}
    @RequestMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
    	
  
    	theModel.addAttribute("customer", new Customer());
    	
    	return "customer-form";
    }
    @RequestMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer")Customer c) {
    	
    	customerBusiness.saveCustomer(c);
    	return"redirect:/customer/list";
    }
    @RequestMapping("showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel) 
    {
    	// set custome as a model attribute to pre-populate the form
    	theModel.addAttribute("customer", customerBusiness.getCustomer(theId));
    	// send over to our form
    	return"customer-form";
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam("customerId")int theId) 
    {
        customerBusiness.delete(theId);
    	return "redirect:/customer/list";
    }
    
}
