package com.amazon.delivery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.delivery.Entity.User;
import com.amazon.delivery.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public String adduser(List<User> user)
	{
		 repo.saveAll(user);
		 return " Added successfully";
	}
	
	public List<User> getuser()
	{
		return repo.findAll();
	}
	

}
