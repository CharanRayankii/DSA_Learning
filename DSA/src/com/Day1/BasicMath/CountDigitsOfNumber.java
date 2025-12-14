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
	//Brute Force Approach
	public static int countDigits(int n) {
		if(n==0) {
			return 1;
		}
		
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	
	//Better Approach
	public static int countDigits1(int n) {
		
		
		int count=(int )(Math.log(n)/Math.log(10))+1;
		
		/*       log10(𝑛)+1
		 * 
		 * in this approach we are calculating with the help of the log 
		 * 
		 * find the log of a number and divide it by log 10 and add 1 to the result.
		 * */
		
		return count;
	}
	

}
