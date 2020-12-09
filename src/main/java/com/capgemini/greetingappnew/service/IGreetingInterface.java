package com.capgemini.greetingappnew.service;

import java.util.List;

import com.capgemini.greetingappnew.model.Greeting;
import com.capgemini.greetingappnew.model.User;

public interface IGreetingInterface {
	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);

	List<Greeting> getAll();
	
	Greeting updateGreeting(long id, User user);
	
	List<Greeting> deleteGreeting(long id);
}
