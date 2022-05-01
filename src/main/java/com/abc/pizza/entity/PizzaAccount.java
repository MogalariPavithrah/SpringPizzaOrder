package com.abc.pizza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.abc.pizza.entity.PizzaAccount;

@Entity
public class PizzaAccount implements Comparable<PizzaAccount>
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pizzaId;
	private String pizzaName;
	//private String pizzaType;
	private int pizzaAmount;

	public PizzaAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PizzaAccount(int pizzaId, String pizzaName, String pizzaType, int pizzaAmount) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		//this.pizzaType = pizzaType;
		this.pizzaAmount = pizzaAmount;
	}
	public int getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	
	public int getPizzaAmount() {
		return pizzaAmount;
	}
	public void setPizzaAmount(int pizzaAmount) {
		this.pizzaAmount = pizzaAmount;
	}
	@Override
	public int compareTo(PizzaAccount pa) {
		// TODO Auto-generated method stub
		return pizzaId - pa.pizzaId;
	}
}