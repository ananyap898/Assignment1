package com.java.thread.hmework4;

public class MainInteruptedThread {

	public static void main(String[] args) throws InterruptedException {
		InteruptedThread t1 = new InteruptedThread("T1");
		InteruptedThread t2 = new InteruptedThread("T2");
		
		t1.start();
		
		//Thread.sleep(10000);

		t1.interrupt();
		t2.start();

	}

}
