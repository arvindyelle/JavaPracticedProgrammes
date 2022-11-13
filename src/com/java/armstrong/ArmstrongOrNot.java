package com.java.armstrong;

import java.util.Scanner;

public class ArmstrongOrNot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int remainder, numSumCube = 0;
		int count = 0;
		for(int j = num; j > 0; j = j/10){
			count++;
		}
		
		for(int i = num; i > 0; i = i/10){
			remainder = i % 10;
			numSumCube = (int) (numSumCube + Math.pow(remainder, count));
		}
		if(num == numSumCube)
			System.out.println(num+" is an Armstrong");
		else
			System.out.println(num+" is not an Armstrong");
	}

}
