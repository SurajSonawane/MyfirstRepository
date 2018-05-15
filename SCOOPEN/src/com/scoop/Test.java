package com.scoop;

 class  P {
public void show(){
	System.out.println("i am in parents");
}
}
 
 public class Test extends  P{
	public void show(){
		System.out.println("i am in child");
	}
	public static void main(String[] args) {
		Test obj = new Test();
		obj.show();
		P t = new Test();
		t.show();
	}
}
 