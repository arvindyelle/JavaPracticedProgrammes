package com.java.palindrome;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.print("Enter an integer: ");
//		int num = scn.nextInt();
//		// Declaring and Initilizing variables
//		int digit, digitSum, temp;
//		temp = num;
//
//		// For loop for the iteration till temp number is greater than 0
//		for (digitSum = 0; temp > 0; temp /= 10) {
//			digit = temp % 10;
//			digitSum = (digitSum * 10) + digit;
//		}
//		if (digitSum == num) {
//			System.out.println(num + " IS A PALINDROME NUMBER");
//		} else {
//			System.out.println(num + " IS A NOT PALINDROME NUMBER");
//		}
		int sum, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		temp=num;
		for(sum=0;temp>0;temp/=10){
			int remainder = temp%10;
			sum = (sum*10)+remainder;
		}
		if(sum == num){
			System.out.println(num+" is a palindrome number ");
		}
		else{
			System.out.println(num+" is not a palindrome number ");
		}
	}

}
