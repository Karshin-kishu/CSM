package com.app.Customer;

public enum Service {
	SILVER (1000) , GOLD (2000) , DIAMOND (5000), PLAT(10000);
	private int price;
	
	private Service (int price) {
		this.price=price;		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return name() + " " + price;
	}
}
