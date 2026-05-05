package com.amazon.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.delivery.Entity.Orders;
import com.amazon.delivery.Service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	public OrdersService service;
	
	@PostMapping("/add-orders")
	public List<Orders> getorders(@RequestBody List<Orders> order)
	{
		return service.addproduct(order);
		
	}
	
	@GetMapping("/get-product")
	public List<Orders> getorders()
	{
		return service.getproduct();
	}

}
