//2 ways of creating basic threads 
//1st extends Threads
//2nd implement Runnable
package com.ExecutorService;

class Task1 extends Thread {
	
	public void run() { // signature
		System.out.print("\nTask1 Started\n");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask 1 Started \n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started\n");
		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 2 done \n");

	}

}

public class ThreadsStart {

	public static void main(String[] args) {

		// Task1
		Task1 task1 = new Task1();
		task1.start();
		task1.setPriority(10); //priority is just a request

		// Task2
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();
		
		// Task3
		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 3 done \n");

		System.out.print("Task Main done");

	}
}
