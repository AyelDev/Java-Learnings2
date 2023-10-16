package com.Generics;

import java.util.ArrayList;

public class MyCustomList<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		// TODO Auto-generated method stub
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public T get(int element) {
		// TODO Auto-generated method stub
		return list.get(element);
	}

	public String toString() {
		return list.toString();
	}

}
