package com.TerminalOperations2;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinCollectTolist {

	public static void main(String[] args) {
		
		
		int compare = List.of(12, 3, 42, 424, 7, 3).stream().filter(e -> e%2 == 1).min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(compare);
		
		List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10).stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(num);
		
		
		 var er = IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList());
		System.out.println(er);
	
		
		var es = List.of(1,3,5).stream().filter(e->e%2==0).max((n1,n2) -> Integer.compare(n1, n2)).orElse(0);	
		System.out.println(es);
	}

}
