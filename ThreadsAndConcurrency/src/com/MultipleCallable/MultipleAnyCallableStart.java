package com.MultipleCallable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableStart {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(4);

		List<CallableTask> listCallable = List.of(new CallableTask("Ariel"), new CallableTask("Cindy"),
				new CallableTask("Kiven"), new CallableTask("John"));

		String invokeAll = executor.invokeAny(listCallable);
		
			System.out.println(invokeAll);
		
		executor.shutdown();

	}


}
