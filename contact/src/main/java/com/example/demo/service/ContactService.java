package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;

@Service
public class ContactService implements ContactServiceInterface {

	List<Contact> list = List.of(
			new Contact("abc@gmial.com", "123456")
		);
	
	@Override
	public Contact getContact() {		
		return list.get(0);
	}

}
