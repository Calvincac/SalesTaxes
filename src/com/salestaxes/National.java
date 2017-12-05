package com.salestaxes;

public class National implements Product {
	
	private double taxes;
	private double price;
	private double finalPrice;
	private String name;
	
	public National(String name, double price) {
		this.price = price;
		this.name = name;
		calculateTaxes();
	}

	@Override
	public double getTaxes() {	
		return this.taxes;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double getFinalPrice() {		
		return this.finalPrice;
	}
	
	@Override
	public void calculateTaxes() {		
		this.taxes = this.price * 0.1;
		this.finalPrice =  this.price + this.taxes;
	}


}
