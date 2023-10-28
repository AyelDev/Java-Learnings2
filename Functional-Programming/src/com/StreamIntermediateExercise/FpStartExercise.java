package com.StreamIntermediateExercise;

import java.util.List;
import java.util.stream.IntStream;

public class FpStartExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1, 2, 3, 2, 2, 2, 2, 2, 2, 2);
		List<String> wordList = List.of("Apple", "Ant", "Cat");

//Exercise - print squares of the first 10 numbers!
// clue - IntStream.range(1,10)
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.print(e + " "));
		
		
		System.out.println();
//List.of("Apple", "Ant", "Bat").stream();
//Map all of these to lowercase and print them
		wordList.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
		System.out.println();
//List.of("Apple", "Ant", "Bat").stream();
//print the length of each element
		wordList.stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));
		
		
	}
}
