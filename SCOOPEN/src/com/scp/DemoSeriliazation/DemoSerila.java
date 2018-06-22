package com.scp.DemoSeriliazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerila {
public static void main(String[] args) throws Exception {
	Dog d1=new Dog(100,200);
	FileOutputStream fout= new FileOutputStream("newFile.txt");
	ObjectOutputStream oobj=new ObjectOutputStream(fout);
	oobj.writeObject(d1);
	System.out.println("at serilization level"+d1);
	FileInputStream fin= new FileInputStream("newFile.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	Dog d2 =(Dog) oin.readObject();
	// After this process we only read the data from file
	
	System.out.println(d1+"------deseri-------"+d2);
	
	 
}
}
