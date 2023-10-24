package com.CollectSumofNumbers;
import java.util.List;
public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		
		
		int sum = numbers.stream()
		.filter(number -> number%2==0)
		.reduce(0, (number1, number2) -> number1 + number2);
		
		System.out.println(sum);
		
//		int sum = sumOfNumber(numbers);
//		System.out.println(sum);
	}

//	private static int sumOfNumber(List<Integer> numbers) {
//		int sum = 0;
//		for(int num: numbers) {
//			sum += num;
//		}
//		return sum;
//	}

}
