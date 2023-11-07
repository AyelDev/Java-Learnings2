package com.Concurrency;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class biCounterWithLock {
	private int i=0;
	private int j=0;
	

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	synchronized public void incrementI(){
		//Get lock
		lockForI.lock();
		i++;
		//Release lock
		lockForI.unlock();
	}

	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ(){
		//Get lock
		lockForJ.lock();
		j++;
		//Release lock
		lockForJ.unlock();
	}

	public int getIJ() {
		return j;
	}
}
