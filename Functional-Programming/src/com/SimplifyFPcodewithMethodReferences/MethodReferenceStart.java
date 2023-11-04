package com.SimplifyFPcodewithMethodReferences;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceStart {

	public static boolean oddEven(Integer sum){
		return sum%2==0;
	}
	
	public static void print(Integer sum) {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = e->e%2==1;
		List.of(2,323,32,54,64).stream()
		.filter(oddPredicate).forEach(System.out::println);
		
		//
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		.map(e -> e.length()).forEach(s -> MethodReferenceStart.print(s));	

		//
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		.map(String::length).forEach(MethodReferenceStart::print);	
		
		
		//
		Integer sum =List.of(23,45,67,24).stream()
		.filter(MethodReferenceStart::oddEven)
		.max(Integer::compare)
		.orElse(0);
		System.out.println(sum);
		
		//step 16
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return e->e%2==0;
	}

}
 	