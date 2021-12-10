package com.ip.MultiThreading;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	static int MAX_SIZE=5;
	static BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(MAX_SIZE);
	
	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		producer.start();
		consumer.start();
	}
	
	static class Producer extends Thread {
		
		Random random = new Random();
		
		public void run() {
			while(true) {
				int element = random.nextInt(MAX_SIZE);
				try {
					System.out.println("Produced = "+element);
					queue.put(element);
					Thread.sleep(50);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class Consumer extends Thread {
		
		public void run() {
			while(true) {
				try {
					System.out.println("Consumed = "+queue.take());
					Thread.sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
