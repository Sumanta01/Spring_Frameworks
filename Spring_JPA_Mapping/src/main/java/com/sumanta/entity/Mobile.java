package com.sumanta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String mobName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobName=" + mobName + "]";
	}
    
	
	
	
	
}
