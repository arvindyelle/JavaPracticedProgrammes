package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		List<String> list = Arrays.asList(sentence.split(" "));
		Map<String, Long> mapOfWords = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapOfWords);
	}

}
