package com.salestaxes;

public class Exempt implements Product {
	
	private double taxes;
	private double price;
	private double finalPrice;
	private String name;
	
	public Exempt(String name, double price) {
		this.name = name;
		this.price = price;
		calculateTaxes();
	}

	@Override
	public double getTaxes() {		
		return this.taxes;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getFinalPrice() {
		return this.finalPrice;
	}
	
	@Override
	public void calculateTaxes() {
		this.taxes = 0;
		this.finalPrice =  this.price + this.taxes;		
	}
	
	
}
