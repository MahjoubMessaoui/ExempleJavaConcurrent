package com.mahjoub.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Mahjoub Messaoui
 *
 */
public class App {

	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++)
			service.submit(() -> ++counter);
		service.shutdown();
		service.awaitTermination(10, TimeUnit.SECONDS);
		if (service.isShutdown())
			System.out.printf("Total count: %d", counter);
	}

}
    
    
    
    

