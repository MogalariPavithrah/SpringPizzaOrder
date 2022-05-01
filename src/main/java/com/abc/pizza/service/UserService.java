package com.abc.pizza.service;

import org.springframework.stereotype.Service; 
import com.abc.pizza.exceptions.InvalidUserException;
import java.util.List;

import com.abc.pizza.entity.Discounts;
import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.entity.User;

@Service
public interface UserService {
	public User searchUser(int Id);
	public List<User> getAllUsers(String city);
	public List<User> getAllUsersByCityAndTotalPurchase();
	public String login(String username,String password) throws InvalidUserException;
	public boolean verifyforRegistration(String username,String password);
	public boolean registrationProcess(User u);
	
}