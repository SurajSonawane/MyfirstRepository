package com.scp.DemoSeriliazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Family {
public static void main(String[] args) throws Exception {
	 
	Father fa= new Father();
	FileOutputStream fout1=new FileOutputStream("FamilyTree.txt");
	ObjectOutputStream obou1=new ObjectOutputStream(fout1);
	obou1.writeObject(fa);
	
	FileInputStream fin1=new FileInputStream("FamilyTree.txt");
	ObjectInputStream obin1=new ObjectInputStream(fin1);
	Father fa1=(Father) obin1.readObject();
	
	System.out.println(fa1.m.s.surName);
}
}
