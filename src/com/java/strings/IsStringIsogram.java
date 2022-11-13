package com.java.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsStringIsogram {
	
	static boolean isIsogram(String str) {
		boolean isogram = true;
		char[] chArray = str.toCharArray();
		Set<Character> setCharaters =  new HashSet<Character>();
		for (Character character : chArray) {
			if (setCharaters.contains(character)) {
				isogram = false;
			}else {
				setCharaters.add(character);
			}
		}
		return isogram;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String inputedStr = sc.next();
		boolean isogram = isIsogram(inputedStr);
		System.out.println("Is "+inputedStr+" Isogram String? "+isogram);
	}

}
