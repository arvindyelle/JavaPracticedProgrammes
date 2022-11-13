package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		
		//access elements from list
		
		System.out.println(numbers.get(3));
	}

}
