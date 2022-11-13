package com.java.strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharaters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		System.out.println("Duplicate characters are :");
		System.out.println(findDuplicatesUsingFor(str));
	}
	
	public static Set<Character> findDuplicatesUsingFor(String str) {
		Set<Character> duplicate =  new  LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					duplicate.add(str.charAt(j));
				}
			}
		}
		return duplicate;
	}

}
