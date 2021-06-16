package com.example.demo.entity;

public class Contact {
	private String email;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String email, String number) {
		super();
		this.email = email;
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	private String number;
}
