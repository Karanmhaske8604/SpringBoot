package com.idempotency.web.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Keysclass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	int id;
	
	String feilds;

	public Keysclass(String feilds) {
	
		this.feilds=feilds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeilds() {
		return feilds;
	}

	public void setFeilds(String feilds) {
		this.feilds = feilds;
	}

}
