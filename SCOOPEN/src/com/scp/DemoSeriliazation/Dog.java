package com.scp.DemoSeriliazation;

import java.io.Serializable;

public class Dog implements Serializable{
 int i;
 transient static int j;
 @Override
public String toString() {
	return "Dog [i=" + i + ", j=" + j + "]";
}
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public int getJ() {
	return j;
}
public void setJ(int j) {
	this.j = j;
}
public Dog(int i, int j) {
	super();
	this.i = i;
	this.j = j;
}

}
