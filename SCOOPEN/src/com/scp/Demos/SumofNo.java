package com.scp.Demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumofNo {
public static void main(String[] args) {
	/*int sum=0;
	String str="afsc12vvewt22xxb11";
	Pattern pattern = Pattern.compile("\\d");
	Matcher matcher = pattern.matcher(str);
	while(matcher.find()){
		sum+=Integer.parseInt(matcher.group());
	}*/int sum=0;
	String str="afsc12vvewt22xxb11";
	 str = str.replaceAll("[^-?0-9]+", " "); 
	 String[] nums = str.trim().split(" ");
	 for (String num : nums) {
		sum+=Integer.parseInt(num);
		System.out.println("Number is -- "+num);
	}
	System.out.println(sum);
}
}
