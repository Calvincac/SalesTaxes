package com.salestaxes;

public class Imported implements Product{
	
	private double taxes;
	private double price;
	private double finalPrice;
	private String name;	
	
	public Imported(String name, double price) {
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
		return finalPrice;
	}

	@Override
	public void calculateTaxes() {
		this.taxes = this.price * 0.05;
		this.finalPrice =  this.price + this.taxes;
	}

}
