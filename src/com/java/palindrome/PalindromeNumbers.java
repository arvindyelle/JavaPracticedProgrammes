package com.java.palindrome;

import java.util.Scanner;

public class PalindromeNumbers {
	public boolean isPalindrome(int num){
		int reverseNum = 0;
		int remainder;
		for(int i = num; i > 0; i = i / 10){
			remainder = i % 10;
			reverseNum = (reverseNum*10) + remainder;
		}
		//System.out.println("kk"+ reverseNum);
		return (num == reverseNum);
	}
	
	public void printPalindromes(int num1, int num2){
		for(int i=num1;i<=num2;i++){
			if(isPalindrome(i)){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		PalindromeNumbers obj = new PalindromeNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a num2 : ");
		int num2 = sc.nextInt();
		
		obj.printPalindromes(num1, num2);
	}

}
