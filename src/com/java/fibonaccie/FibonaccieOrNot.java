package com.java.fibonaccie;

import java.util.Scanner;

public class FibonaccieOrNot {
	public static boolean checkMember(int n) {
	    int x = 0;
	    int y = 1;
	    int sum = 0;
	    boolean isTrue = true;

	    for (int i = 1; i <= n; i++) {
	        x = y;
	        y = sum;
	        sum = x + y;
	        if (sum == n) {
	            isTrue=true;
	           // System.out.println(n+"is a fibonaccie number");
	            break;
	        } else {
	            isTrue=false;
	            //System.out.println(n+"is not a fibonaccie number");
	        }
	    }
	    return isTrue;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
	    int n = sc.nextInt();
	    if (checkMember(n)) {
			System.out.println(n+" is a fibonaccie number");
		}else {
		    System.out.println(n+" is not a fibonaccie number");
		}
	}
}
