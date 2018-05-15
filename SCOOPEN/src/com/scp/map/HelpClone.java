package com.scp.map;

public class HelpClone implements Cloneable {
String name;
int rollNo;
Address add;
public HelpClone(String name, int rollNo, Address add) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.add = add;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


}
