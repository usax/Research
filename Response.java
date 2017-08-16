package com.tsys.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class Response {
	@JsonProperty("id") //this annotation is also necessary
	private long id1;
	
	@JsonProperty("name") //this annotation is also necessary
	private String name1;
	
	@JsonProperty("age") //this annotation is also necessary
	private int age1;
	
	@JsonProperty("salary") //this annotation is also necessary
	private double salary1;
	@JsonProperty("phoneNumbers")
	private List<Phone1> phoneNumbers1;

	public List<Phone1> getPhoneNumbers1() {
		return phoneNumbers1;
	}


	public void setPhoneNumbers1(List<Phone1> phoneNumbers1) {
		this.phoneNumbers1 = phoneNumbers1;
	}


	public Response(){
	}
	
	
	public long getId1() {
		return id1;
	}

	public void setId1(long id1) {
		this.id1 = id1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public double getSalary1() {
		return salary1;
	}

	public void setSalary1(double salary1) {
		this.salary1 = salary1;
	}
}
