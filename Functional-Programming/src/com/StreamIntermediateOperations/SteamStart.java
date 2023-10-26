package com.StreamIntermediateOperations;

import java.util.List;

public class SteamStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = List.of(3,5,8,10,23,22,9,3);
		List<Integer> list2 = List.of(5,7,2,23,6,1,2,7,5);
		//sorting
		list.stream().sorted().forEach(e -> System.out.print(e + " ")); //sorting ascending or descending
		System.out.println();
		//cancels repeated input
		//can also combine sort
		list2.stream().distinct().sorted().forEach(element -> System.out.print(element + " ")); 
		
		System.out.println();
		//map
		list.stream().distinct().map(e -> e*e).forEach(e -> System.out.print(e + " "));
		
	}

}
