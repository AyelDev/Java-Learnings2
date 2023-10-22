package com.GenericsandWildCardsUpperandLowerBound;

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

	public T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

	public String toString() {
		return list.toString();
	}

}
