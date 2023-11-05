package com.Concurrency;

public class Counter {
	int i=0;
	
	
	synchronized public void increment(){
		i++;
	}

	public int getI() {
		return i;
	}
}
