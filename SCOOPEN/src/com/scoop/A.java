package com.scoop;

public class A {
	
	//int b;
	//private int s;
	//static int r;
 public static void main(String[] args) {
	
}
}

class B extends A{
	public int j=1;
	public int m(int a ){
		if(a==1)
		return new Integer(10);
		return a;
		
	}
	
	 
	
	public static void main(String[] args) {
		  B su = new B();
		int q = su.m(1);
		System.out.println(q);
		//System.out.println(su.b);
		//System.out.println(s);
		//System.out.println(r);
	}
	 
	}

