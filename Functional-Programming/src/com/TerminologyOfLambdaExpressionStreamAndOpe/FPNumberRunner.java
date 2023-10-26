package com.TerminologyOfLambdaExpressionStreamAndOpe;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(fpSum(numbers));
		

	}
	
	private static int fpSum(List<Integer> numbers) {
		var sum = numbers.stream()
				.filter(number -> number%2==0)
				.reduce(0, (number1, number2) -> { 
					System.out.println(number1 + " " + number2);
					return number1 + number2;
					});
		return sum;
	}
	
	//(number1, number2) -> number1 + number2) Lambda Expression - a shortcut method(accepts a parameters and return it)

	
/*
 * Intermediate Stream: Intermediate streams are used in stream
 *  processing operations to perform transformations, filtering, 
 *  and other intermediate operations on the data within the stream. 
 *  These operations are typically lazy and do not produce a final result
 *   until a terminal operation is invoked. Common intermediate operations 
 *   include map, filter, and sort.

Terminal Stream: Terminal streams are used to produce a final result 
or trigger a side effect. When a terminal operation is invoked on a stream, 
it processes the data in the stream and produces a result or performs an action. 
Common terminal operations include forEach, collect, and reduce
 * */
}
