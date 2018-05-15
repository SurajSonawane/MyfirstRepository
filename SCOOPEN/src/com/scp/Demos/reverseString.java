package com.scp.Demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class reverseString {
	public static void main(String[] args) {

		// BY USEING BYTE CODE
		/*
		 * String input = "suraj"; byte[] strAsByteArray = input.getBytes();
		 * byte [] result = new byte [strAsByteArray.length];for( int i =
		 * 0;i<strAsByteArray.length;i++) { result[i] =
		 * strAsByteArray[strAsByteArray.length - i - 1];
		 * }System.out.println(new String(result)); }
		 */

		// BY USEING STRING BUILDER

		/*
		 * String input = "suraj";
		 * 
		 * StringBuilder input1 = new StringBuilder();
		 * 
		 * // append a string into StringBuilder input1 input1.append(input);
		 * 
		 * // reverse StringBuilder input1 input1 = input1.reverse();
		 * 
		 * // print reversed String System.out.println(input1); }
		 */

		// BY USEING CHAR ARRAY

		/*
		 * { String input = "suraj"; String input2="sonawane"; // convert String
		 * to character array // by using toCharArray char[] try1 =
		 * input.toCharArray(); char[] try2 = input2. toCharArray();
		 * 
		 * for (int i = try1.length-1; i>=0; i--){
		 * 
		 * System.out.print(try1[i]); } System.out.println(); for(int
		 * j=try2.length-1;j>=0;j--){
		 * 
		 * System.out.print(try2[j]); } }
		 */

		// BY SWAPPING MECANIZAM

		{
			String input = "Suraj Sonawane";
			char[] temparray = input.toCharArray();
			int left, right = 0;
			right = temparray.length - 1;

			for (left = 0; left < right; left++, right--) {
				// Swap values of left and right
				char temp = temparray[left];
				temparray[left] = temparray[right];
				temparray[right] = temp;
			}

			for (char c : temparray)
				System.out.print(c);
			System.out.println();

		}
                         // BY LIST ITERATORS
		{
			String input = "jay Maharashtra";
			char[] hello = input.toCharArray();
			ArrayList<Character> trial1 = new ArrayList<>();

			for (char c : hello)
				trial1.add(c);

			Collections.reverse(trial1);
			ListIterator<Character> li = trial1.listIterator();
			while (li.hasNext())
				System.out.print(li.next());
		}

	}

}
