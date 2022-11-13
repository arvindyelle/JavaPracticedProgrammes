package com.java.prime;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a range : ");
		int num = sc.nextInt() ;
		int count = 0;
		for(int i=1; i<=num; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					count ++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}

}
