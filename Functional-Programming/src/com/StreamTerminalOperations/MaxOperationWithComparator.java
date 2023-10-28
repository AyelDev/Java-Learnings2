package com.StreamTerminalOperations;


import java.util.List;
import java.util.stream.IntStream;

public class MaxOperationWithComparator {

	public static void main(String[] args) {

		var sum = IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);

		var compare = List.of(12, 3, 42, 424, 1, 2).stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(compare);
		
		
	}

}
