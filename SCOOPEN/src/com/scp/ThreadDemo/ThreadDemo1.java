package com.scp.ThreadDemo;
//By extending thread class
public class ThreadDemo1 implements Runnable   {
	public void run(){
		
		for(int i=0;i<10;i++){
		if(i==5){	
	  try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
		System.out.println("i am in run method");}
	
/*public static void main(String[] args) {
	ThreadDemo1 th1=new ThreadDemo1();
	th1.start();
	//for(int i=0;i<5;i++)
	System.out.println("i am in main classs");
}*/
}
}