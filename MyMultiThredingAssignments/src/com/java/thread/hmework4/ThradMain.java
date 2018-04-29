package com.java.thread.hmework4;

public class ThradMain {
	static int x = 0;

	public static void main(String[] args) {
		// System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <= 100; i++) {

			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
					x++;
					System.out.println("thread count is :"+x);
				}
			}.start();
		}
	}
}
