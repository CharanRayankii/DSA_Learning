package com.Day1.BasicMath;

import java.util.Scanner;

//Finding the largest Digit In a Number
public class LargestDigitInaNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(largest(n));
		
	}
	public static int largest(int n) {
		int largest = Integer.MIN_VALUE;
		while(n!=0) {
			int ld = n%10;
			if(ld>largest) {
				largest = ld;
			}
			n=n/10;
		}
		return largest;
	}

}
