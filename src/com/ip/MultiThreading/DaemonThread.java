package com.ip.MultiThreading;

public class DaemonThread {

	public static void main(String[] args) throws InterruptedException {
		
		String name = Thread.currentThread().getName();
		Boolean isDaemon = Thread.currentThread().isDaemon();
		System.out.println("Thread ="+name+" isDaemon ="+isDaemon );
		
		Runnable task = new Task();
		Thread t1 = new Thread(task, "T1");
		System.out.println("Thread spawned from main thread");
		System.out.println("name: " + t1.getName() + ", isDaemon: " + t1.isDaemon());
		
		t1.setDaemon(true);
		t1.start();
		
		t1.join();
	}
	
	private static class Task implements Runnable{

		@Override
		public void run() {
			Thread t1 = Thread.currentThread();
			System.out.println("Thread made daemon by calling setDaemon() method");
            System.out.println("name: " + t1.getName() + ", isDaemon: " + t1.isDaemon());
            
            // Any new thread created from daemon thread is also daemon
            Thread t2 = new Thread("T2");
            System.out.println("Thread spawned from a daemon thread");
            System.out.println("name: " + t2.getName() + ", isDaemon: " + t2.isDaemon());
			
			
		}
		
	}
}
