package com.java.strings;

import java.util.Scanner;

public class ReverseStringWithoutInBuildMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String name = sc.next();
		char chars[] = name.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
	}
}
