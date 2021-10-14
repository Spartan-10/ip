package com.ip.MultiThreading;

public class PrintEvenOddUsingThread {

	public static void main(String[] args) {
		
		Printer print = new Printer();
		Thread oddThread = new Thread(new TasKEvenOdd(print, 10, false));
		Thread evenThread = new Thread(new TasKEvenOdd(print, 10, true));
		
		oddThread.start();
		evenThread.start();
	}
}

class TasKEvenOdd implements Runnable {

	private int max;
	private Printer print;
	private boolean isEvenNumber;

	public TasKEvenOdd(Printer print, int max, boolean isEvenNumber) {
		this.max = max;
		this.print = print;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {
		int number = isEvenNumber == true ? 2 : 1;
		while (number <= max) {
			if (isEvenNumber) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}
			number += 2;
		}

	}

}

class Printer {
	boolean isOdd = false;

	synchronized void printEven(int number) {
		while (isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even: " + number);
		isOdd = false;
		notifyAll();
	}

	synchronized void printOdd(int number) {
		while (isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd: " + number);
		isOdd = true;
		notifyAll();
	}
}
