import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{

	private String name;
	
	public CallableTask(String name) {
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Hello " + name;
	}
	
}

public class CallableStart {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		Future<String> welcomeFuture = executor.submit(new CallableTask("Ariel"));
		
		System.out.println("\nNew Callable is completed");
		
		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);
		
		System.out.println("\nMain completed ");
		executor.shutdown();
		
		//step 12
	}

}
