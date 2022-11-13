package com.java.array;

import java.util.Scanner;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array(Minimum 2):");
		int noOfElements = sc.nextInt();
		int[] array  = new int[noOfElements];
		System.out.println("Enter all elements");
		for (int i = 0; i < noOfElements; i++) {
			System.out.println("Enter element on "+i+" index place");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < noOfElements; i++) {
			for (int j = i + 1; j < noOfElements; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;		
				}
			}
		}
		System.out.println("Largest: "+ array[noOfElements-1]);
		System.out.println("Second Largest: "+ array[noOfElements-2]);
		System.out.println("Smallest: "+ array[0]);
		System.out.println("Second Smallest: "+ array[1]);
	}

}
