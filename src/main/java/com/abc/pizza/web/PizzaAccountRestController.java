package com.abc.pizza.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.pizza.dto.LoginDTO;
import com.abc.pizza.entity.*;
import com.abc.pizza.exceptions.InvalidUserException;
import com.abc.pizza.service.PizzaAccountService;
import com.abc.pizza.validation.ValidateEntry;

@RestController
@RequestMapping("/pizza")
public class PizzaAccountRestController {
	@Autowired
	PizzaAccountService pizzaAccountService;
	
	
	
	@GetMapping("/admin/accounts")
	public List<PizzaAccount> doThis()
	{
		return pizzaAccountService.getAllPizza();
	}
	
	
	@PostMapping("/admin/add") 
	public String savedAccountFromWeb(@RequestBody PizzaAccount a)
	{
		boolean status = pizzaAccountService.insertPizzaAccount(a);
	
		return status == true?"Pizza Added ":"Contact to customer Care";
	}
	@PutMapping("/admin/update")//localhost:8080/pizza/admin/update?name=chickenpizza&amount=555
	public String updated(@RequestParam String name,@RequestParam int amount) {
		String msg = "Test updated";
		boolean result = pizzaAccountService.updatePizzaAccount(name, amount);
		return msg;
	}

}
