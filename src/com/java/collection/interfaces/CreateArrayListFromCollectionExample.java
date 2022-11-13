package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
	public static void main(String[] args) {
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(1);
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(11);
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);
	}
}
