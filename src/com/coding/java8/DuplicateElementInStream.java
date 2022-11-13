package com.coding.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementInStream {
	public static void main(String[] args) {
		List<String> elementsList = Arrays.asList("aravind", "lavanya", "pari", "aravind", "manasa", "manasa");
		Set<String> uniqueNames = new HashSet<>();
		//
		Set<String> dupElements = elementsList.stream().filter(name -> !uniqueNames.add(name))
				.collect(Collectors.toSet());
		System.out.println("using filter then add to set: " + dupElements);
		System.out.println(uniqueNames);

		// using collections.frequency
		Set<String> duplicateElements = elementsList.stream().filter(i -> Collections.frequency(elementsList, i) > 1)
				.collect(Collectors.toSet());
		System.out.println("using filter with collections.frequency: " + duplicateElements);

		// using collectors.groupingBy
		Map<String, Long> mapOfNames = elementsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<String> dupNames = mapOfNames.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey()).collect(Collectors.toSet());
		System.out.println("using collectors.groupingBy(): " + dupNames);
		System.out.println("using collectors.groupingBy(): " + mapOfNames);
	} 

}
