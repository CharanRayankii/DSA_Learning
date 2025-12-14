package com.Day1.BasicMath;

import java.security.DomainCombiner;
import java.util.Scanner;

/*/Program to count the Digits of a an number
 * i/p:- 12345
 * o/p:- 5
*/
public class CountDigitsOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		//creating scanner object to take input dynamically
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println("No of Digits : "+countDigits(n));
		
		
	}
	
	public static int countDigits(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	

}
