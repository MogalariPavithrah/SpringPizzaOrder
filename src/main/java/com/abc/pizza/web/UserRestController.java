package com.abc.pizza.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.pizza.dto.LoginDTO;
import com.abc.pizza.exceptions.InvalidUserException;
import com.abc.pizza.exceptions.UnauthorizedUserException;
import com.abc.pizza.exceptions.UnauthorizedUserException;
import com.abc.pizza.service.UserService;
import com.abc.pizza.validation.ValidateEntry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



import com.abc.pizza.entity.User;


@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	UserService userSer;
	
	@PostMapping("/login")
	public boolean doLogin(@RequestBody LoginDTO loginObj,HttpServletRequest req) throws InvalidUserException{
		String username = loginObj.getUsername();
		String password = loginObj.getPassword();
		if(ValidateEntry.validateNull(username)&&ValidateEntry.validateNull(password)) {
			String role = userSer.login(username, password);
			if(userSer.verifyforRegistration(username, password)) {
			
				if(role!=null)
				{
				
					// generate new session 
					HttpSession session = req.getSession(true);
					
					session.setAttribute("role", role);
					session.setAttribute("username",username);
					session.setAttribute("password",password);
					return true;
					
				
				
				}
				else
				{
				System.out.println("Exception1");
				throw new InvalidUserException("","");
				}
			
			  }
			
			
			
		}
		else
		{
			System.out.println("Exception2");
			throw new InvalidUserException("","");
		}
		return false;
	}
	@GetMapping("/logout")
	public boolean doLogout(HttpServletRequest req)
	{
		HttpSession session = req.getSession(false);
		
		if(session != null)
		{
			session.invalidate(); // to logout
			return true;
		}
		else return false;
	}
	@PostMapping("/Registration")
	public String Registration(@RequestBody User u,HttpServletRequest req) {
		HttpSession Session = req.getSession(false);
		if(Session!=null) {
			if(Session.getAttribute("username").equals(u.getUserName()) || Session.getAttribute("password").equals(u.getPassword())){ 
				userSer.registrationProcess(u);
				return  "Username or password already exists";
			}
			else
			{
				userSer.registrationProcess(u);
				return "Registration Successfull";
			}
		}
		else {
			userSer.registrationProcess(u);
			return "Registration Successfull";

			
		}
			
			
		
	}
	
	@GetMapping("/{Id}")
	public User getUser(@PathVariable int userId) {
		User obj = userSer.searchUser(userId);
		return obj;
	}
}
