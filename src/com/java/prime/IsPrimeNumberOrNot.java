package com.java.prime;

import java.util.Scanner;

public class IsPrimeNumberOrNot {

	public static void main(String[] args) {
		int num;
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = in.nextInt();
		for (int i = 2; i < num; i++) {
			//count = 0;
			if (num%i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
	}

}
