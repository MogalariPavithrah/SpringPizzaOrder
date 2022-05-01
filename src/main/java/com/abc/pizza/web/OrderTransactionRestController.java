package com.abc.pizza.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.pizza.entity.OrderTransactions;
import com.abc.pizza.service.OrderTransactionService;


@RestController
@RequestMapping("/orders")
public class OrderTransactionRestController {
	@Autowired
	OrderTransactionService orderservice;

	public OrderTransactionRestController() {
		super();
		
		System.out.println("-----Inside order Constructor");
	}
	
	@GetMapping("/allorders")
	public List<OrderTransactions> getallOrderTransactions()
	{
		return orderservice.getallBookingTransactions();
	}
	
	
}
