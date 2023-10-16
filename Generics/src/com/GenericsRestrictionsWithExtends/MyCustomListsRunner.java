package com.GenericsRestrictionsWithExtends;

import java.util.ArrayList;
import java.util.List;

//allow MYCustomList to be used as Number only

public class MyCustomListsRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unrestricted
		String value = doubleValue(new String());
		Integer number = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());
		
		ArrayList numbers = new ArrayList<>(List.of(1,2,3,4));
		duplicate(numbers);
		System.out.println(numbers);
		
		/*******************************************************/
		MyCustomLists<Long> lists = new MyCustomLists<>();
		lists.addElement(2l);
		lists.addElement(20l);
		lists.addElement(Long.valueOf(39));
		System.out.println(lists);
		
		//get the specific element from the list
		Long valued = lists.get(2);
		System.out.println("element of: " + valued);
		
		MyCustomLists<Integer> lists2 = new MyCustomLists<>();
		lists2.addElement(Integer.valueOf(1));
		lists2.addElement(Integer.valueOf(8));
		System.out.println(lists2);
		
		//get the specific element from the list
		Integer value2 = lists2.get(1);
		System.out.println("element of: " + value2);
	}

}
