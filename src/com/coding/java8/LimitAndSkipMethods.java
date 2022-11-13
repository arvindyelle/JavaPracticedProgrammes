package com.coding.java8;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipMethods {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,6,7,7,8,9,10,6,8,11);
		list.stream().limit(6).forEach(x -> System.out.print(x+" "));
		System.out.println();
		//skip method
		System.out.println("--- Skip method ----");
		list.stream().skip(6).forEach(x -> System.out.print(x+" "));

	}

}
