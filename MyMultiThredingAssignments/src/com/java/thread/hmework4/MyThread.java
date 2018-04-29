package com.java.thread.hmework4;

public class MyThread extends Thread {
	public String threadname;

	public MyThread(String threadname) {
		this.threadname =threadname;
	}

	public void run() {
		System.out.println("my thread is in running stae"+getName());
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread("thread1");
		MyThread thread2 = new MyThread("thread2");
		thread2.start();
		thread1.start();
		//Thread.sleep(100);
		// thread1.sleep(1000);

	}

}
