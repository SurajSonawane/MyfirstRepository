package com.scp.coll;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		employee e1 = new employee(100, "sur");
		employee e2 = new employee(102, "raj");
		employee e3 = new employee( 100,"sur");
		
		//e2=e3;
		HashSet<employee> setEmp = new HashSet<employee>();
		setEmp.add(e1);
		setEmp.add(e2);
		setEmp.add(e3);
		int n=e1.hashCode();
		int n1=e2.hashCode();
		int n2=e3.hashCode();
		
		
		
System.out.println(e1);
System.out.println("e1="+n);
System.out.println(e2);
System.out.println("e2="+n1);
System.out.println(e3);
System.out.println("e3="+n2);





System.out.println("*****************");


System.out.println(setEmp);
	}
 
}
