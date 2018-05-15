package com.scp.Demos;

public class circularString {
public static void main(String[] args) {
	String a="suraj";
	String b="raj";
	b=a+b;
	System.out.println(b);
	a=b.substring(5);
	System.out.println(a);
	b=b.substring(0,5);
	System.out.println(b);
	}
}
