package com.Day1.BasicMath;

import java.util.Scanner;

// program to count the no of odd digits in a number.
public class CountNoOfOddDigits {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(noOfOddDigits(n));
	}
	
	
	public static int noOfOddDigits(int n) {
		int count = 0;
		while(n!=0) {
			int remainder = n % 10;
			if(remainder % 2 != 0) {
				count++;
			}
			n=n/10;
		}
		return count;
	}

}
