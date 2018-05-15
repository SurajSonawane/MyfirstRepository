package com.scp.DemoSeriliazation;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
String name= "suraj";
transient String password="JAI MAHARASHTRA";

private void writeObject(ObjectOutputStream os)throws Exception{
	 //os.writeObject(password);
	password+="123";
	os.writeObject(name);
	os.writeObject(password);
	os.defaultWriteObject();
}

private void readObject(ObjectInputStream in)throws Exception{
	name=(String) in.readObject();
	password=  (String) in.readObject();
	//password=epass.substring(3);
}
}
