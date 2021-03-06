package com.example.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Service.UserService;
import com.example.demo.entity.Contact;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserService service;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") String user) {
//		System.out.println(user);
		User u = new User();
		String ret;
		if(service.getUser(user)==null)
			ret="";
		else {
			ret = service.getUser(user).getName();
			u.setName(ret);
			Contact c = restTemplate.getForObject("http://CONTACT-SERVICE/contact/Samyak", Contact.class);
			System.out.println(c);
			u.setContact(c);
		}
		
		return u;
	}
}
