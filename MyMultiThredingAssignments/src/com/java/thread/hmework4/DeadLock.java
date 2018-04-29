package com.java.thread.hmework4;

public class DeadLock implements Runnable{
	public void run(){
		//System.out.println("thrad is running"+Thread.currentThread().getName());
	}
	public  void eatMeat(){
		System.out.println(Thread.currentThread().activeCount()+"Tiger is eating meat");
	}
	public synchronized void drinkWater(){
		System.out.println(Thread.currentThread().activeCount()+"Tiger is drinking water");
	}

	public static void main(String[] args) {
		
		DeadLock tiger1 = new DeadLock();
		DeadLock tiger2 = new DeadLock();
	 tiger1.eatMeat();
	 tiger2.eatMeat();
	 tiger1.drinkWater();
	 tiger2.drinkWater();
	 
	 

	}
	}
