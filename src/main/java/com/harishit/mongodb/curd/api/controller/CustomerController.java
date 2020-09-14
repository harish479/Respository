package com.harishit.mongodb.curd.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harishit.mongodb.curd.api.model.Customer;
import com.harishit.mongodb.curd.api.mongo.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	@RequestMapping(value = "/customer",method = RequestMethod.GET)
	public List<Customer> getCustomer() {
		return repository.findAll();
	}

	@RequestMapping(value ="/customer",method = RequestMethod.POST)
	public String createCustomer(@RequestBody Customer customer) {
		repository.save(customer);
		return "Customer is Created Successfully..!!";
	}
	@RequestMapping(value ="/customer",method = RequestMethod.DELETE)
	public String name() {
		repository.deleteAll();
		return "Customers are deleted successfully..!!";
	}
	@RequestMapping(value ="/customer/{location}",method = RequestMethod.GET)
	public Customer findCutomerByLocation(@PathVariable("location")String location) {
		return repository.findByLocation(location);

	}



}
