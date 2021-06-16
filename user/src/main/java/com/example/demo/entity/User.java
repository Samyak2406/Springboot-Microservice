package com.example.demo.entity;


public class User {
	
	private Contact contact;
	private String name;
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Contact contact, String name) {
		super();
		this.contact = contact;
		this.name = name;
	}	
	
}
