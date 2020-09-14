package com.harishit.mongodb.curd.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document 
public class Customer {
	@Id
	private int id;
	private String name;
	private String location;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
