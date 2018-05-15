package com.scp.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		HashMap<Integer, String> has1 = new HashMap<>();
		has1.put(1, "suraj");
		has1.put(2, "maharashtra");
		has1.put(1, "vilas");// if key is same then new updated value is printed
								// on console.
		has1.put(10, "divya");
		System.out.println("*******entery set********");
		for (Entry<Integer, String> m : has1.entrySet()) {
			System.out.println(m.getValue() + "---" + m.getKey());
		}
		System.out.println("****key set for loop********");

		Set<Integer> m1 = has1.keySet();

		for (Integer r : m1) {

			System.out.println(r + "==>value=" + has1.get(r));
		}
		System.out.println("******key set********");
		Set<Integer> m2 = has1.keySet();
		Iterator<Integer> itr = m2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + "==> value is=" + has1.get(m2));

		}

	}
}