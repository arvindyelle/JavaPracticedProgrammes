package com.java.fibonaccie;

import java.util.Scanner;

public class FibonaccieUptoGivenIValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int range = sc.nextInt();
		int  num1=0, num2=1,num3;
		for (num1 = 0; num1 <= range ;) {
			System.out.print(num1+", ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}

	}

}
