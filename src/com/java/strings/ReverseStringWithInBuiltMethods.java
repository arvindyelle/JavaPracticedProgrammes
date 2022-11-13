package com.java.strings;

import java.util.Scanner;

public class ReverseStringWithInBuiltMethods {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String name = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb = sb.reverse();
		System.out.println(sb);
		
	}
}

