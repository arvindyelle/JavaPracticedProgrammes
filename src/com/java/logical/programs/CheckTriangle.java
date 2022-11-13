package com.java.logical.programs;

import java.util.Scanner;

public class CheckTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of Triangle: ");
		int a = sc.nextInt();
		System.out.println("Enter base of Triangle: ");
		int b = sc.nextInt();
		System.out.println("Enter height of Triangle: ");
		int h = sc.nextInt();
		
		if (a==b && b==h ) {
			System.out.println("Equilateral Triangle");
		}else if (a==b || b==h || h==a) {
			System.out.println("Isosceles Triangle");
		}
		else {
			System.out.println("Scalene Triangle");
		}
	}

}
