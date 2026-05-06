package com.idempotency.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idempotency.web.Entity.Car;


@Repository
public interface CarRepo extends JpaRepository<Car, Integer>{

}
