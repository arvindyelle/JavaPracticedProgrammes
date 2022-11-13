package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class CollectionDemo {
	
	public static void main(String[] args) {
		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("Banana");
		fruitCollection.add("Apple");
		fruitCollection.add("phinaphile");
		fruitCollection.add("kiwi");
		fruitCollection.add("grapes");
		System.out.println(fruitCollection);
		
		// using size() in collection
		System.out.println("---using size() in collection---");
		int size = fruitCollection.size();
		System.out.println(size);
		
		//using isEmpty() in collection
		System.out.println("---using isEmpty() in collection---");
		System.out.println(fruitCollection.isEmpty());
		
		//using contain() in collection
		System.out.println("---using contain() in collection---");
		System.out.println(fruitCollection.contains("kiwi"));
		
		//Iterator<E> iterator() in collection
		System.out.println("---using Iterator<E> iterator() in collection---");
		Iterator<String> iterator = fruitCollection.iterator(); 
		while (iterator.hasNext()) { 
            String element = iterator.next(); 
            System.out.println(element); 
        } 
		
		//using remove() in collection
		System.out.println("---using remove() in collection---");
		fruitCollection.remove("grapes");
		System.out.println(fruitCollection);
		
		
		//new collection object
		Collection<String> fruitCollection1 = new ArrayList<>();
		fruitCollection1.add(null);
		System.out.println(fruitCollection1);
		//using equal() in collection
		System.out.println("---using equal() in collection---");
		boolean val = fruitCollection.equals(fruitCollection1);
		System.out.println(val);
		
		//using hasCode() in collection
		System.out.println("---using hascode() in collection---");
		int val1 = fruitCollection1.hashCode();
		System.out.println(val1);
		
		//spliterator
		System.out.println("---using spliterator() in collection---");
		Spliterator<String> spliterator = fruitCollection.spliterator();
		int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
		 //methods
		System.out.println(spliterator.characteristics() == expected);
		System.out.println(spliterator.estimateSize());
		System.out.println(spliterator.getExactSizeIfKnown());
		//System.out.println(fruitCollection.spliterator().getComparator());
		
		//stream()
		System.out.println("---using stream() in collection---");
		Collection<String> listEndWithLetterE = fruitCollection.stream().filter(s -> s.endsWith("e")).collect(Collectors.toList());
		System.out.println(listEndWithLetterE);
		
		//foreach()
		System.out.println("---using forEach() in collection---");
		fruitCollection.forEach((element) -> {
			System.out.println(element);
		});
		
	}
}
