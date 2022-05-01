package com.abc.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.pizza.exceptions.InvalidUserException;

import com.abc.pizza.repository.UserRepository;
import java.util.List;

import com.abc.pizza.entity.User;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository usersRepository;
	
	
	@Override
	public User searchUser(int Id) {
		User u = usersRepository.findAll().get(Id);
		return u;
		
	}
	@Override
	public List<User> getAllUsers(String city) {
		
		return  null;
	}
	@Override
	public List<User> getAllUsersByCityAndTotalPurchase() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	@Override
	public String login(String username, String password)throws InvalidUserException
	{
		
		String role = usersRepository.verifyUser(username, password);
		
		return role;
	}

	public boolean verifyforRegistration(String username,String password) {
		if(usersRepository.verifyEntries(username,password)== true) {
			return true;
		}
		else 
		{
			return false;
		}
	
		
	}
	public boolean registrationProcess(User u){
		usersRepository.save(u);
		return true;
	}
}