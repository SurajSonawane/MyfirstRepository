package com.scoop;

public class Test4 {
	static void Do(){
		System.out.println("i am in parent classs");
		
	}
	 
}
class Test5{
	static void Do(){
		System.out.println("i am in child class");
	}
	public static void main(String[] args) {
		Test5.Do();
	}
}
