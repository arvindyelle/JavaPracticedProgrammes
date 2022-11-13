package com.java.array;

import java.util.Scanner;

public class SecondHighestMarks {

	public static void main(String[] args) {
		System.out.println("Enter No. of Student");
		Scanner scan = new Scanner(System.in);
		int student_no = scan.nextInt();

		// Marks Array.........
		int[] marks = new int[student_no];

		// Student name array.....
		String[] names= new String[student_no];
		int max = 0;
		int sec = max;
		for (int i = 0; i < student_no; i++) {
			System.out.println("Enter Student Name of id = " + i + ".");
			names[i] = scan.next();
			
			System.out.println("Enter Student Score of id = " + i + ".");
			marks[i] = scan.nextInt();
			if (marks[max] < marks[i]) {
				sec = max;
				max = i;
				
			} else if (marks[sec] < marks[i] && marks[max] != marks[i]) {
				sec = i;
			}
			System.out.println("max: " + max +" or sec: "+sec);
		}

		if (max == sec) {
			sec = 1;
			for (int i = 1; i < student_no; i++) {
				if (marks[sec] < marks[i]) {
					sec = i;
				}
				//System.out.println(sec);
			}
		}

		System.out.println("Higherst score id = \"" + max + "\" Name : \"" + names[max] + "\" Max mark : \""
				+ marks[max] + "\".\n");
		System.out.println("Second Higherst score id = \"" + sec + "\" Name : \"" + names[sec]
				+ "\" Max mark : \"" + marks[sec] + "\".\n");
	}

}
