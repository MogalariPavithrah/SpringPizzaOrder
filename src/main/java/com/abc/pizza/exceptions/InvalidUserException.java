package com.abc.pizza.exceptions;

public class InvalidUserException extends Exception {
	
	String username;
	String password;
	public InvalidUserException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvalidUserException(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return passwordConvertor();
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String passwordConvertor()
	{
		int len = password.length();
		String encryedCode = "";
		for(int i = 0;i<len/2;i++)
		{
			encryedCode+="*";
		}
		String lastString = password.substring(len/2, len);
		password =  encryedCode+lastString;
		return password;
	}
	

}