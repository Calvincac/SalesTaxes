package com.salestaxes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {		
		
		ArrayList<Product> array = new ArrayList<>();
		
		Exempt book =  new Exempt("Book", 12.49);
		Exempt chocolate =  new Exempt("Chocolate bar", 0.85);
		National music = new National("music CD", 14.99);
		
		array.add(book);
		array.add(chocolate);
		array.add(music);
		
		Manager manager = new Manager(array);
		manager.printResult();
	}
}
