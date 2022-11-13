package com.java.array;

import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicateElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int[] dupArray = new int[n];
		int index = 0, count = 0;
		System.out.println("Enter all the elements ");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element on "+i+" index");
			arr[i] = sc.nextInt();
		}
		System.out.println("----- After inserted elements in Array ----");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+", ");
		}
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = i+1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				dupArray[index]=arr[i];
				index++;
			}
		}
		
		for (int i = 0; i < index; i++) {
			arr[i] = dupArray[i];
		}
		System.out.println("\n--- After remove all duplicate elements in Array ---");
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
