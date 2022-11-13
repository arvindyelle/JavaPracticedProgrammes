package com.java.logical.programs;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String arg[]){
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}
