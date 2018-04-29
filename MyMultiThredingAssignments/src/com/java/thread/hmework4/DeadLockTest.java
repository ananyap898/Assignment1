package com.java.thread.hmework4;

public class DeadLockTest {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();

		MyThread1 r1 = new MyThread1(lock1, lock2);
		Mythread2 r2 = new Mythread2(lock1, lock2);

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");

		t1.start();
		t2.start();

	}

}
