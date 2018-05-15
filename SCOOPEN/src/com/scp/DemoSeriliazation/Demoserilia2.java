package com.scp.DemoSeriliazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demoserilia2 {
public static void main(String[] args) throws Exception {
	
	Account a1=new Account();
	System.out.println(a1.name+"-------"+a1.password);
	FileOutputStream fout3=new FileOutputStream("Account.txt");
	ObjectOutputStream obj3=new ObjectOutputStream(fout3);
	obj3.writeObject(a1);
	
	System.out.println(a1.name+"-----------"+a1.password);
	
	FileInputStream fin3=new FileInputStream("Account.txt");
	ObjectInputStream obin3=new ObjectInputStream(fin3);
	Account a2=(Account) obin3.readObject();
	System.out.println(a2.name+"-------------"+a2.password);
	
	
	
}
}
