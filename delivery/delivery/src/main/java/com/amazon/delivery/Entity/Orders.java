package com.amazon.delivery.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int o_id;
	
	@Column(unique = true)
	String product_id;
	
	String o_name;
	double o_price;
	String status;
	String avalaible;
	
//	@JoinColumn
//	@ManyToOne
//	private User use r;
//	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public double getO_price() {
		return o_price;
	}
	public void setO_price(double o_price) {
		this.o_price = o_price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAvalaible() {
		return avalaible;
	}
	public void setAvalaible(String avalaible) {
		this.avalaible = avalaible;
	}
	
	
	
	
	

}
