package com.ip.MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWaitNotify {

	static int MAX_SIZE = 3;
	static List<Integer> list = new ArrayList<Integer>();

	static class Producer implements Runnable {

		List<Integer> list;

		public Producer(List<Integer> list) {
			this.list = list;
		}

		@Override
		public void run() {
			int i = 0;
			while (true) {
				synchronized (list) {
					if (list.size() == MAX_SIZE) {
						try {
							System.out.println("Producer is waiting...");
							list.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Produce: " + i);
					list.add(i++);
					list.notifyAll();

					try {
//						System.out.println("Sleeping Producer...");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		}

	}

	static class Consumer implements Runnable {

		List<Integer> list;

		public Consumer(List<Integer> list) {
			this.list = list;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (list) {

					while (list.isEmpty()) {
						System.out.println("Consumer is waiting...");
						try {
							list.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					int k = list.remove(0);
					System.out.println("Consumed: " + k);
					list.notifyAll();
					try {
//						System.out.println("Sleeping Consumer...");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}

	}

	public static void main(String[] args) {
		Thread producer = new Thread(new Producer(list));
		Thread consumer = new Thread(new Consumer(list));

		producer.start();
		consumer.start();
	}
}
