package com.myproduct.model;

public class User {

	protected int id;
	protected String brand;
	protected String name;
	protected String quantity;

	public User(int id, String brand, String name, String quantity) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.quantity = quantity;
	}

	public User(String brand, String name, String quantity) {
		super();
		this.brand = brand;
		this.name = name;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
