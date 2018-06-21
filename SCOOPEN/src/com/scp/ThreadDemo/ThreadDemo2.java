package com.scp.ThreadDemo;

import java.util.concurrent.TimeUnit;

public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			
			if(i==5){
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo2 th2=new ThreadDemo2();
		Thread thh2=new Thread(th2);
		thh2.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i am in main");
		
		
	}

}
