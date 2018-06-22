package com.scp.DemoSeriliazation;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
String name= "suraj";
transient String password="JAI MAHARASHTRA";


@Override
public String toString() {
	return "Account [name=" + name + ", password=" + password + "]";
}

public Account() {
	super();
	// TODO Auto-generated constructor stub
}

public Account(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}

private void writeObject(ObjectOutputStream os)throws Exception{
	 //os.writeObject(password);
	
	os.writeObject(name);
	password="123"+password;
	os.writeObject(password);
	os.defaultWriteObject();
}

private void readObject(ObjectInputStream in)throws Exception{
	name=(String) in.readObject();
	password=  (String) in.readObject();
	password=password.substring(3);
	// password=password.spz
	//password=epass.substring(3);
}
}
