package com.FilteringOddOrEven;

import java.util.List;

public class NumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		printWithFPWithFiltering(list);

	}

//	private static void printBasicWithFiltering(List<Integer> list) {
//		for (Integer integer : list) {
//			if (string.endsWith("ple")) {
//				System.out.println(string);
//			}
//		}
//	}
	
	
	
	
//	private static void printWithFPWithFiltering(List<Integer> list) {
//		list.stream()
//		.filter(elements -> elements.endsWith("ple")
//				)
//		.forEach(elements -> System.out
//				.println("element : " + elements)
//				);
//	}
	
	private static void printWithFPWithFiltering(List<Integer> list) {
		list.stream()
		.filter(element -> element%2==1)
		.forEach(elements -> System.out
				.println("element : " + elements)
				);
	}
}
