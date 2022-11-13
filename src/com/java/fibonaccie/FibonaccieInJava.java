package com.java.fibonaccie;

import java.util.Scanner;

public class FibonaccieInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = sc.nextInt();
		int num1=0;
		int num2=1;
		int num3;
		for(int i = 1; i <= count; i++){
			System.out.print(num1+",");
			 num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}

}
