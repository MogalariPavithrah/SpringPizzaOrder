package com.abc.pizza.repository;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.pizza.exceptions.InvalidUserException;

public class CustomAccountRepositoryImpl implements CustomAccountRepository{

	@Autowired
	EntityManager jpa; // Spring Data JPA supprot of Entity Manager
	
	@Override
	public String verifyUser(String username, String password) throws InvalidUserException{
		
		Session spring = jpa.unwrap(Session.class);
		
		String query = "select a.role from Account a where a.username =:enteredUsername and a.password =:enteredPassword";
		
		Query<String>  q = spring.createQuery(query);
		q.setString("enteredUsername", username);
		q.setString("enteredPassword", password);
		
		List<String> output =  q.getResultList();
		
		if(output.size()!=0)
		{
			return output.get(0); // role of that user 
		}else
		{
			throw new InvalidUserException(username,password);
		}
		
		
	}

	
}


