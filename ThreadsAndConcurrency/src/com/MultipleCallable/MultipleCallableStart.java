package com.MultipleCallable;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class MultipleCallableStart {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		List<CallableTask> listCallable = List.of(new CallableTask("Ariel"), new CallableTask("Cindy"),
				new CallableTask("Kive"), new CallableTask("John"));

		List<Future<String>> invokeAll = executor.invokeAll(listCallable);
		
		for(Future<String> Result: invokeAll) {
			System.out.println(Result.get());
		}
		
		executor.shutdown();

	}

}
