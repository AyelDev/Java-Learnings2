package com.CommunicationBetweenThreads;


class Task1 extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");	
		}
	System.out.print("Task1 Done \n");
	}
}
class Task2 implements Runnable{

	@Override
	public void run() {
		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.print("Task2 Done \n");
	}

}

public class JoinMethodStart {
	
	public static void main(String[] args) {
		
		
		Task1 task1 = new Task1();
		task1.start();
		
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();
		
		
		
		//wait for task1 to complete
		try {
			task1.join();
			task2thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");
		}
		System.out.print("Task3 Done \n");
	}

}
