package com.ip.MultiThreading;

public class Code3_Implementing_Runnable_LambdaExpression {

	public static void main(String[] args) {
		
		System.out.println("Starting "+Thread.currentThread().getName());
		
		System.out.println("Creating Runnable... ");
		
		Runnable runnable = () -> {
			try {
				for (int i = 4; i > 0; i--) {
					System.out.println("Running "+Thread.currentThread().getName()+" : "+i);
					Thread.sleep(50);
				}
			}catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" interrupted");
			}
		};
		
		System.out.println("Creating Thread...");
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Exiting "+Thread.currentThread().getName());
	}
}
