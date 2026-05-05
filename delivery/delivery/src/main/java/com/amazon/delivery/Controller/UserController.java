package com.amazon.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.delivery.Entity.User;
import com.amazon.delivery.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService service;
	
	@PostMapping("/add-user")
	public String addusers(@RequestBody List<User> user )
	{
		return service.adduser(user);
	}
	
	@GetMapping("/get-user")
	public List<User> showuser()
	{
		return service.getuser();
	}
	

}
