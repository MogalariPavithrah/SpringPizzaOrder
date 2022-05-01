package com.abc.pizza.dto;

import java.util.Objects;

public class PizzaAccountResoponseDTOAdmin 
{
	private int pizzaId;
	private String pizzaName;
	private int pizzaAmount;
	private boolean pizzaStatus;
	private String userName;
	private String MobileNumber;
	private String emailId;
	public String location;
	public PizzaAccountResoponseDTOAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PizzaAccountResoponseDTOAdmin(int pizzaId, String pizzaName, int pizzaAmount, boolean pizzaStatus,
			String userName, String mobileNumber, String emailId, String location) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.pizzaAmount = pizzaAmount;
		this.pizzaStatus = pizzaStatus;
		this.userName = userName;
		MobileNumber = mobileNumber;
		this.emailId = emailId;
		this.location = location;
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
	public boolean isPizzaStatus() {
		return pizzaStatus;
	}
	public void setPizzaStatus(boolean pizzaStatus) {
		this.pizzaStatus = pizzaStatus;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(MobileNumber, emailId, location, pizzaAmount, pizzaId, pizzaName, pizzaStatus, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaAccountResoponseDTOAdmin other = (PizzaAccountResoponseDTOAdmin) obj;
		return Objects.equals(MobileNumber, other.MobileNumber) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(location, other.location) && pizzaAmount == other.pizzaAmount
				&& pizzaId == other.pizzaId && Objects.equals(pizzaName, other.pizzaName)
				&& pizzaStatus == other.pizzaStatus && Objects.equals(userName, other.userName);
	}
	
	
}
