package com.scp.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestHash {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyInfo my = new MyInfo(23, "Suraj");
		AddressForHash add = new AddressForHash(43003, "Aurangabad", my);
		DemoHash dem = new DemoHash(101, "IT", add);
		// dem.setAdd(add);
		// add.setMy1(my);

		MyInfo my2 = new MyInfo(24, "RAJ");
		AddressForHash add2 = new AddressForHash(14503, "PUNE", my2);
		DemoHash dem2 = new DemoHash(102, "NON-IT", add2);

		// deep cloning
		AddressForHash addgetClon = add.clone();
		DemoHash demogetClon = dem.clone();

		AddressForHash dublicateAddress = demogetClon.getAdd();
		AddressForHash orignalAddress = dem.getAdd();
		MyInfo dublicateInfo = addgetClon.getMy1();
		MyInfo orignalInfo = add.getMy1();

		// DemoHash dem3 = dem;

		HashMap<DemoHash, String> has = new HashMap<>();
		has.put(dem, "sur");
		has.put(dem2, "Ra");
		// has.put(dem3,"copy");

		// System.out.println(has.get(new DemoHash(102,"NON-IT",add)) );

		// convert Hashmap to Arraylist(list)
		ArrayList<DemoHash> l1 = new ArrayList<DemoHash>();
		Set<DemoHash> set = new HashSet<DemoHash>();
		set = (Set<DemoHash>) has.keySet();
		l1.addAll(set);

		System.out.println(has);
		System.out.println("************comparable******************");
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println("**********comparator** with*** annonymous****");
		Collections.sort(l1, AddressForHash.compBypin);
		System.out.println(l1);

		System.out.println("**************deep cloneing*****************");
		System.out.println("address  ==" + dublicateAddress.getCity() == orignalAddress.getCity());
		System.out.println("my Info ===" + dublicateInfo.getName() == orignalInfo.getName());
		System.out.println(dublicateAddress.getPincode()==orignalAddress.getPincode());
		System.out.println(demogetClon.getAdd().getPincode() == dem.getAdd().getPincode());

	}
}
