package com.java.thread.hmework4;

public class MyThread1 implements Runnable {
	private Object lock1;
	private Object lock2;

	public MyThread1(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {

		synchronized (lock1) {

			System.out.println(Thread.currentThread().getName() + "Lock resorce one");

		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (lock2) {
			System.out.println(Thread.currentThread().getName() + "Lock resorce two");

			
		}

	}

}
