package com.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread {
	
	private int number;

	public Task(int number) {
		this.number = number;
	}
	
	public void run() { // signature
		System.out.print("\nTask1 " + number + " Started\n");
		for (int i =number*1; i <= number*10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask1 " + number +" Done \n");
	}
}


public class ExecutorServiceStart {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		//Customizing number of threads
		ExecutorService executorService2 = Executors.newFixedThreadPool(3);
		
		executorService2.execute(new Task(1));
		executorService2.execute(new Task(2));
		executorService2.execute(new Task(3));
		executorService2.execute(new Task(4));
		executorService2.execute(new Task(5));
		
		
//		executorService2.execute(new Thread(new Task2()));
//		System.out.println("Task3 kicked off");
//		
//		for(int i = 20; i<=30; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\nTask3 done");
		executorService2.shutdown();
	}

}
