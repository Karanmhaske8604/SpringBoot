package com.amazon.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.delivery.Entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
