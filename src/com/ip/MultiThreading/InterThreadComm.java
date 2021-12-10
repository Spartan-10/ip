package com.ip.MultiThreading;

public class InterThreadComm {
	
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			try {
				System.out.println(Thread.currentThread().getName()+" Calling wait method");
				b.wait();
				System.out.println(Thread.currentThread().getName()+" got notification call ");
				System.out.println("Total = "+b.total);
			} catch (Exception e) {
				System.out.println("Total = "+b.total);
			}
		}
	}

}

class ThreadB extends Thread {
	int total=0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+" Starts Calculation ");
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			System.out.println(Thread.currentThread().getName()+" is Giving notification call ");
			this.notify();
		}
	}
}
