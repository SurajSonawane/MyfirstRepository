package com.scp.Demos;

import java.util.Scanner;

public class RotationalStr {
public static void main(String[] args) {
Scanner scr= new Scanner(System.in);
System.out.println("orignal string");
String Input=scr.nextLine();
System.out.println("enter rotational string");
String rotational=scr.nextLine();
if(chechRotational( Input,rotational)){
	System.out.println(Input +"and"+rotational+"these are rotational to each other");
	
}
else
System.out.println("these are not rotational strings");
}

private static boolean chechRotational(String str1, String str2) {
	if(str1.length() != str2.length()){
		return false;
	}
	String concat=str1+str1;
	if(concat.indexOf(str2)!=-1){
		return true;
	}
	
	return false;
	
}
}
