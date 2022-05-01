package com.abc.pizza.exceptions;

public class UnauthorizedUserException extends Exception{
	private String username;
	private String password;
	public UnauthorizedUserException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnauthorizedUserException(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public UnauthorizedUserException(String username2) {
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String passwordCoverter() {
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