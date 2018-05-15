package com.scp.Demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
public static void main(String[] args) {
	
	int sum=0;
	
	String Calword="bcbcONEnbhTWOjjvSIXhb";
	String replace1=Calword.replaceAll("ONE","1");
	 
	String replace2=replace1.replaceAll("TWO","2");
	 String replace3=replace2.replaceAll("SIX","6");
	System.out.println(replace3);
	 
	Pattern pattern = Pattern.compile("\\d");
	Matcher matcher = pattern.matcher(replace3 );
	while(matcher.find()){
		sum+=Integer.parseInt(matcher.group());
		System.out.println("Number is -- "+sum);
	
	 }
	 
	 System.out.println(sum);
	 
/*	String outString="";
	Pattern p= Pattern.compile("[A-Z]");
	Matcher m=p.matcher(Calword);
	while(m.find()){
		outString+=m.group();
	}
	System.out.println(outString);
	String str=String.valueOf(outString);
	System.out.println(str);*/
}
}
 