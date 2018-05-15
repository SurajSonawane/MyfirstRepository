package com.scp.map;

public class DoClone {
public static void main(String[] args) throws CloneNotSupportedException{
	Address add=new Address(431003,"aurangabad");
	HelpClone hel=new HelpClone("suraj",36, add);
	 HelpClone hel2 =(HelpClone) hel.clone();
	 add. city="pune";
	 System.out.println("origmal="+hel.name+"=="+hel.rollNo );
	 System.out.println(hel.add.city);
	  System.out.println("");
	 System.out.println("cloned="+hel2.name+"=="+hel2.rollNo);
	 System.out.println(hel2.add.city);
}
}
