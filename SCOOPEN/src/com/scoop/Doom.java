package com.scoop;

public class Doom extends Meeo implements Groom,Zoom {
	
public static void main(String[] args) {
	Meeo m=new Doom();
	m.G1();
	Doom d= new Doom();	
       d.z1();
Zoom z= new Zoom() {
	
	@Override
	public void z1() {
		 System.out.println("ala re ala");
		
	}
};z.z1();
}
@Override
public void z1() {
	// TODO Auto-generated method stub
	System.out.println("ab mai kya karu");
}
 
}
