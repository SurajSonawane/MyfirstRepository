package com.scp.Demos;

import java.util.HashMap;

public class GetkeyFromvalu {
	public static void main(String[] args) {
		Employee1 emp1=new Employee1(23,"pune");
		Employee1 emp2=new Employee1(51,"Aurangabad");
		
		HashMap<Object, String> hmap = new HashMap<>();
		hmap.put(emp1, "suraj");
		hmap.put(emp2, "vilas");
		//hmap.put(300, "Divya");
		
		System.out.println(Getkey(hmap,emp2));
	}

	public static String Getkey(HashMap<Object, String> hmap, Object s) {
		for (Object o : hmap.keySet()) {
			 if(hmap.get(s).equals(o)) 	
				 System.out.println(hmap.get(s));
				 return hmap.get(s);
			
		}
		return null;
		
	}
}
