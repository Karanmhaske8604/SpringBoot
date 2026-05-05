package com.amazon.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.delivery.Entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

}
