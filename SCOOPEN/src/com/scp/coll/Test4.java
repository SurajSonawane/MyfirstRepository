package com.scp.coll;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
public static void main(String[] args) {
	
	ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("suraj");  
	  al2.add("Hanumat"); 
	  al2.addAll(al);
	  boolean ie=al.isEmpty();
	  System.out.println(ie);
	  System.out.println("*************"); 
	  boolean b=al2.containsAll(al);
	  System.out.println(b);
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	   System.out.println("************");
	   
       List<String> myList = new ArrayList<String>();
       myList.add("java");
       myList.add("c");
       myList.add("c++");
       System.out.println("Initial list:"+myList);
       Collections.addAll(myList, "perl","php");
       System.out.println("After adding elements:"+myList);
       String[] strArr = {".Net", "unix","suraj"};
       Collections.addAll(myList, strArr);
       System.out.println("After adding array:"+myList);
	   
	   System.out.println("***************");
	   List<String> youList= new ArrayList<String>();
	   youList.add("100");
	   youList.add("200");
	   Iterator<String> you=youList.iterator();
	   while(you.hasNext()){
		   System.out.println("integer list"+you.next());
	   }
	   Collections.addAll(youList,"suraj");
	   //youList.addAll(myList);
	   System.out.println("final list"+youList);
	   System.out.println("**********************");
	   System.out.println("before youlist"+youList);
	   System.out.println("before retainall mylist"+myList);//is used to delete all the elements of invoking collection except the specified collection.
	   boolean taken=myList.retainAll(youList);
	   System.out.println(taken);
	   System.out.println("after"+myList);
	   System.out.println("********************");
	   List<String>tackList= new ArrayList<String>();
	   tackList.add("malamal");
	   tackList.add("weekly");
	   tackList.add("reloaded");
	   tackList.add("200");
	   int s=tackList.size();
	   int m=myList.size();
	   System.out.println("size of tacklist="+s);
	   System.out.println("size of my list="+m);
	   System.out.println("********************");
	   List<String>sameList= new ArrayList<String>();
	   sameList.add("malamal");
	   sameList.add("weekly");
	   sameList.add("reloaded");
	   sameList.add("200");
	   System.out.println("previous contain tacklist"+tackList);
	   System.out.println("previous contain youlist"+sameList);
	   boolean lele=tackList.contains("malamal");
	   boolean gele=tackList.containsAll(sameList);//containAll check all values bet. two lists
	   System.out.println("contains tacklist to youlist="+lele);//contain is used to search an element
	   System.out.println("containall ta to you="+gele);
	   System.out.println("after con. tack "+tackList);
	   System.out.println("after con. you"+ sameList);
	  }  
}
}
