package com.java.thread.hmework4;

public class FooThreadClass extends Thread {
	public FooThreadClass(String Thread) {
		this.setName(Thread);
	}

	public void run() {
		System.out.println("Thread is Running   :" + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		Foo f1 = new Foo();
		FooThreadClass thread1 = new FooThreadClass("T1");
		FooThreadClass thread2 = new FooThreadClass("T2");
		FooThreadClass thread3 = new FooThreadClass("T3");
		f1.first(thread1);
		f1.second(thread2);
		f1.third(thread3);
		

	}

}
