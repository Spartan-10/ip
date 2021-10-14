package com.ip.MultiThreading;

public class InterThreadComm {
	
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete..");
				b.wait();
			} catch (Exception e) {
				System.out.println("Total = "+b.total);
			}
		}
	}

}

class ThreadB extends Thread {
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<100;i++) {
				total+=i;
			}
			notify();
		}
	}
}
