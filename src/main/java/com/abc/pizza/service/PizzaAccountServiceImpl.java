package com.abc.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.pizza.entity.OrderTransactions;
import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.exceptions.InvalidPizzaException;
import com.abc.pizza.exceptions.InvalidUserException;
import com.abc.pizza.repository.PizzaAccountRepository;

import com.abc.pizza.service.PizzaAccountService;

@Service
public class PizzaAccountServiceImpl implements PizzaAccountService{
	
	@Autowired
	PizzaAccountRepository pizzaAccountRepository;

	

	@Override
	public List<PizzaAccount> getAllPizza() {
		// TODO Auto-generated method stub

	    return pizzaAccountRepository.findAll();
	}

	@Override
	public boolean insertPizzaAccount(PizzaAccount a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PizzaAccount getPizzaAccount(int pId) {
		// TODO Auto-generated method stub
		return pizzaAccountRepository.findAll().get(pId);
	}

	


	
	@Override
	public boolean updatePizzaAccount(String name,int amount) {
		pizzaAccountRepository.replace(name, amount);
		return true;
	}

	@Override
	public boolean deletePizzaAccount(String a) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
