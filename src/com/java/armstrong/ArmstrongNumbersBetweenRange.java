package com.java.armstrong;

import java.util.Scanner;

public class ArmstrongNumbersBetweenRange {
	public boolean isArmstrong(int num){
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
			return true;
		else
			return false;
	}

	public static void main(String arg[]) {
		ArmstrongNumbersBetweenRange obj = new ArmstrongNumbersBetweenRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Armstrong Number between 0 to " + num);
		for (int i = 0; i <= num; i++) {
			boolean result = obj.isArmstrong(i);
			if (result) {
				System.out.println(i + " ");
			}
		}
	}
}
