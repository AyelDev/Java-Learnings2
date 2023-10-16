package com.Generics;

public class MyCustomListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("hello");
		list.addElement("world");
		System.out.println(list);
		
		//get the specific element from the list
		String value = list.get(1);
		System.out.println("element of: " + value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(8));
		System.out.println(list2);
		
		//get the specific element from the list
		Integer value2 = list2.get(1);
		System.out.println("element of: " + value2);
		
		
	}

}
