package com.scp.Demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorSix {
	public static void ByEntery(){
		
	}	
public static void main(String[] args) {
	HashMap<Integer,String> map1=new HashMap<>();
	map1.put(1,"suraj");
	map1.put(2,"sushant");
	map1.put(3,"divya");
	map1.put(4,"pragati");
System.out.println("******************entery set******foreach*********************");
for(Entry<Integer,String> entery: map1.entrySet()){
	 System.out.println(entery.getValue()); 
	System.out.println(entery.getKey());
	System.out.println("****************** entery set***********************");
	Set<Entry<Integer, String>> s=map1.entrySet();
	 Iterator <Entry<Integer,String>>itr=s.iterator();
	 while(itr.hasNext()){
	 Entry<Integer,String> q= itr.next() ;
		
		System.out.println(q.getValue());
	 }
}
}
}