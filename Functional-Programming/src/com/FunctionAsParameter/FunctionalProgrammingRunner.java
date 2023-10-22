package com.FunctionAsParameter;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list = List.of("sad", "happy", "joy", "alone");
//		printWithFp(list);
		
		List<Number> numlist = List.of(1.4,23f,3,4);
		printWithFp(numlist);
		
		
	}

//	private static void printBasic(List<String> list) {
//		for(String string: list) {
//			System.out.println(string);
//		}
//	}
	
	private static void printWithFp(List<Number> list) {
		list.stream().forEach(
					element -> System.out.println("element : " + element)
				);
	}
}
