package com.abc.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.pizza.entity.OrderTransactions;
import com.abc.pizza.repository.OrderTransactionRepository;



@Service
public class OrderTransactionServiceImpl implements OrderTransactionService{
	@Autowired
	OrderTransactionRepository orderRepository;
	

	@Override
	public List<OrderTransactions> getallBookingTransactions() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
}
