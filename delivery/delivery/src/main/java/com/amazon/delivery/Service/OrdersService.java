package com.amazon.delivery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.delivery.Entity.Orders;
import com.amazon.delivery.Repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository repo;
	
	public List<Orders> addproduct(List<Orders> order)
	{
		return repo.saveAll(order);
	}
	
	public List<Orders> getproduct()
	{
		return repo.findAll();
	}
	

}
