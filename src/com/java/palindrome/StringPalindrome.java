package com.java.palindrome;

import java.util.Scanner;

public class StringPalindrome {
	
	public boolean isPalindrome(String str) {
		String rev="";
		boolean ans = false;
		for (int i = str.length() - 1; i >= 0 ; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		str = str.toLowerCase();
		StringPalindrome obj = new StringPalindrome();
		
		 boolean result = obj.isPalindrome(str);
		 System.out.println("isPalindrome:"+result);
		
	}

}
