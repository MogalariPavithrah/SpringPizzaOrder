package com.abc.pizza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.pizza.entity.OrderTransactions;

@Service
public interface OrderTransactionService {
	public List<OrderTransactions>getallBookingTransactions();

}
