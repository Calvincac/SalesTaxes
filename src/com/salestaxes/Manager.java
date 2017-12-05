package com.salestaxes;

import java.util.ArrayList;

public class Manager {
	
	private ArrayList<Product> products;
	private double total = 0;
	
	public Manager(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public double getAmountOfTaxes() {
		double sum = 0;
		for(int i=0; i<this.products.size(); i++) {			
			sum = sum + this.products.get(i).getTaxes();
			this.total+= this.products.get(i).getFinalPrice();
		}		
		return sum;
	}
	
	public void printResult() {
		
		for(int i=0; i<this.products.size(); i++) {
			System.out.println(this.products.get(i).getName() +" " + this.products.get(i).getFinalPrice());
		}
		System.out.println("Sales Taxes: " + this.getAmountOfTaxes());
		System.out.println("Total: " + this.total);
	}


}
