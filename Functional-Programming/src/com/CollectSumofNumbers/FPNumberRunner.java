package com.CollectSumofNumbers;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(fpSum(numbers));
		
//		int sum = sumOfNumber(numbers);
//		System.out.println(sum);
	}
	
	private static Integer fpSum(List<Integer> numbers) {
		var sum = numbers.stream()
				.filter(number -> number%2==1)
				.reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

//	private static int sumOfNumber(List<Integer> numbers) {
//		int sum = 0;
//		for(int num: numbers) {
//			sum += num;
//		}
//		return sum; //this is called mutation because the value of sum is changing overtime as i adds itself
//	}

}
