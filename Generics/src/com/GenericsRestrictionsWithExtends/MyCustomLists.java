package com.GenericsRestrictionsWithExtends;

import java.util.ArrayList;

public class MyCustomLists<T extends Number> {
	ArrayList<T> lists = new ArrayList<>();

	public void addElement(T element) {
		// TODO Auto-generated method stub
		lists.add(element);
	}

	public void removeElement(T element) {
		lists.remove(element);
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return lists.get(index);
	}

	public String toString() {
		return lists.toString();
	}
}
