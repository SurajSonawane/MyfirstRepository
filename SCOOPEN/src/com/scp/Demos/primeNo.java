package com.scp.Demos;

public class primeNo {
	/*
	 * public static void main(String[] args) { 
	 * int i = 0; int num = 0; // Empty
	 * String String primeNumbers = "";
	 * 
	 * for (i = 1; i <= 100; i++) 
	 * {
	 *  int counter = 0; 
	 *  for (num = i; num >= 1;num--) { 
	 * if (i % num == 0)
	 *  { counter = counter + 1; }
	 *   }
	 *  if (counter == 2)
	 * { // Appended the Prime number to the String 
	 * primeNumbers = primeNumber + i + " "; } } 
	 * System.out.println("Prime numbers from 1 to 100 are :");
	 * System.out.println(primeNumbers); } }
	 */
	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		int n = 3;// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}
}