package com.hidden.entities;

import java.math.BigInteger;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	@Id
	private BigInteger _id;
	private String email;
	private String password;
	private ArrayList<Shop> preferedShops;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Shop> getPreferedShops() {
		return preferedShops;
	}
	public void setPreferedShops(ArrayList<Shop> preferedShops) {
		this.preferedShops = preferedShops;
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.preferedShops = new ArrayList<>();
	}
	
	
	
}
