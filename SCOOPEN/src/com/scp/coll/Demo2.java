package com.scp.coll;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo2 {
public static void main(String[] args) {
	HashSet<Integer> h= new HashSet<>();
	boolean b1=h.add(200);
	System.out.println("b1="+b1);
	boolean b2=h.add(200);
	System.out.println("b2="+b2);
	boolean b3=h.add(400);
	System.out.println("b3="+b3);
	boolean b4=h.add(500);
	System.out.println("b4="+b4);
	System.out.println(h);
	int s=h.size();
	System.out.println("size="+s);
	 //Integer f=(Integer) h.clone();
	 //System.out.println(f);
	TreeSet<String> T=new TreeSet<>();
	T.add("suraj");
	T.add("ratan");
	T.add("magan");
	T.add("chagan");
	T.add("suraj");
	System.out.println(T);
	//Demo2 D= new Demo2();
	//D.toString().
}
}
