package com.scoop;

public abstract class Meeo implements Groom {
	 public void G1(){
		  System.out.println("jai maharashtra");
	  }
	 public static void main(String[] args) {
		Groom gr=new Groom(){

			@Override
			public void G1() {
				System.out.println("suraj"); 
				
			}
			
		};gr.G1();
	}
}
