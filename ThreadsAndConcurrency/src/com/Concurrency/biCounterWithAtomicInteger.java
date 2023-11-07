package com.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class biCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	synchronized public void incrementI(){
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}
	
	synchronized public void incrementJ(){
		j.incrementAndGet();
	}

	public int getIJ() {
		return j.get();
	}
}
