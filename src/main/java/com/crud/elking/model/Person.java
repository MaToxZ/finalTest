package com.crud.elking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@Column(name = "P_ID")
	private long id;
	@Column(name = "P_NAME")
	private String name;
	@Column(name = "P_LNAME")
	private String lName;
	@Column(name = "P_EMAIL")
	private String email;
	
	

	public Person() {
		
	}

	public Person(long id, String name, String lName, String email) {
		this.id = id;
		this.name = name;
		this.lName = lName;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
