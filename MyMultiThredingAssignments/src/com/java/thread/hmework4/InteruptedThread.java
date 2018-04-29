package com.java.thread.hmework4;

public class InteruptedThread extends Thread {
	
	public InteruptedThread(String thread) {
		this.setName(thread);
		
	}

	public void run() {
		/* LOGIC*/
		for (int i = 0; i < 6; i++) {
			if(Thread.interrupted()){
				System.out.println("Thread is inturupted :"+i+" ,"+Thread.currentThread().getName());
			}
			
			else{
				System.out.println("Thread is normal thread :"+i+" ,"+Thread.currentThread().getName());
			}
		}
	}

}
