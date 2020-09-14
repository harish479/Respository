package com.harishit.mongodb.curd.api.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harishit.mongodb.curd.api.model.Customer;
@Repository
public interface CustomerRepository extends MongoRepository<Customer,String>{
	public Customer findByLocation(String location) ;
}
