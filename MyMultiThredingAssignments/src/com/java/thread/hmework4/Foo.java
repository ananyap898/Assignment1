package com.java.thread.hmework4;

public class Foo {

	public Foo() {

	}

	public void first(FooThreadClass thread1) {
		thread1 = new FooThreadClass("Thread1");
		thread1.start();
		System.out.println("Calling FooCalss first method" + Thread.currentThread().getName());
	}

	public void second( FooThreadClass thread2) {
		thread2 = new FooThreadClass("Thread2");
		thread2.start();
		System.out.println("calling FooClass second "+Thread.currentThread().getName());
	}

	public void third(FooThreadClass thread3) {
		thread3 = new FooThreadClass("Thread3");
		thread3.start();
		System.out.println("calling FooClass Third"+Thread.currentThread().getName());
	}
}
