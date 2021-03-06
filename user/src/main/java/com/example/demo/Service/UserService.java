package com.example.demo.Service;

import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {

	List<User> list = List.of(
			new User(new Contact("abc@gmail.com", "123456"), "abc@gmail.com"),
			new User(new Contact("vora@gmail.com", "12345116"), "Vora")
	);
	
	@Override
	public User getUser(String name) {

		return list.get(0);
	}

}
