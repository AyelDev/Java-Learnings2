package com.GenericsandWildCardsUpperandLowerBound;

import java.util.ArrayList;
import java.util.List;

public class MyCustomListRunner {

	static <X> X doubleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	//// Upper Bounded wildcard ////
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for(Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;	
	}
	
	////Lower Bounded wildcard ////
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.5);
		numbers.add(14.5f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.2,1.3,1.5,5.3)));
		System.out.println(sumOfNumberList(List.of(231l,1233l,51321l,3123l)));
		
		List<Number> emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
		
	}

}
