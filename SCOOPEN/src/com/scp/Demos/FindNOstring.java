package com.scp.Demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNOstring {
public static void main(String[] args) {
	int sum=0;
	String findDigit="yara00yara-milna2bara";
	Pattern pat =Pattern.compile("\\d");  //d- it gives int value from string
 	Matcher mat=pat.matcher(findDigit);   //D= it gives char from string    
	 while(mat.find()){
		 
	System.out.print(mat.group());
	 sum=sum+Integer.parseInt(mat.group());
}
	 System.out.println("sum of extracted number from strinmg is"+sum);
	
}
}
