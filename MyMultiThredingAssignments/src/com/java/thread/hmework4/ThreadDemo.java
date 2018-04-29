package com.java.thread.hmework4;

public class ThreadDemo implements Runnable {
	// static int count =0;

	@Override
	public void run() {
		try{
		System.out.println("Thread" + Thread.currentThread().getId() +" is running");
		}
		catch(Exception E){
			System.out.println("Exception is caught");
			
			
		}

	}
}
	