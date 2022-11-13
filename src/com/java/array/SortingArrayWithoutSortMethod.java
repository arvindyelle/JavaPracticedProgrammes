package com.java.array;

public class SortingArrayWithoutSortMethod {

	public static void main(String[] args) {
		int[] array = new int[] {3,12,4,6,67,23,14,89,5};
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}

}
