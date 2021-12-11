package com.ip.MultiThreading;

//Java program to illustrate Callable and FutureTask 
//for random number generation 
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableHelper implements Callable<Object> {

	public Object call() throws Exception {
		Random generator = new Random();
		Integer randomNumber = generator.nextInt(5);
		Thread.sleep(randomNumber * 1000);
		return randomNumber;
	}
}

public class CallableExample {
	public static void main(String[] args) throws Exception {

		// FutureTask is a concrete class that
		// implements both Runnable and Future
		FutureTask[] randomNumberTasks = new FutureTask[5];

		for (int i = 0; i < 5; i++) {
			 Callable<Object> callable = new CallableHelper();

			// Create the FutureTask with Callable
			randomNumberTasks[i] = new FutureTask<Object>(callable);

			// As it implements Runnable, create Thread
			// with FutureTask
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();
		}

		for (int i = 0; i < 5; i++) {
			// As it implements Future, we can call get()
			System.out.println(randomNumberTasks[i].get());
		}
	}
}
