package com.idempotency.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idempotency.web.Entity.Keysclass;

@Repository
public interface KeysRepo extends JpaRepository<Keysclass, Integer> {

}
