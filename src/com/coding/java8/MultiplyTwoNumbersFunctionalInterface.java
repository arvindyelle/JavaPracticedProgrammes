package com.coding.java8;

import java.util.Scanner;

@FunctionalInterface
interface Finterface{
	public int mutiply(int a, int b);
}

public class MultiplyTwoNumbersFunctionalInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Finterface result = (a, b) -> a*b;
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		int output = result.mutiply(a, b);
		System.out.println("Multiply two numbers: "+output);
	}
}
