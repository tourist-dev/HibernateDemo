package com.orakris.HIbernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Insurance {
	@Id
	private int id; 
	private String name; 
	private int tenure; 
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	} 
	
}
