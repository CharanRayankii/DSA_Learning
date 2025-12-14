package com.Day1.BasicMath;

import java.util.Scanner;

//Reversing a number program 
public class ReverseNumber {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(reverse(n));
	}
	public static int reverse(int n) {
		int x = 0;
		while(n!=0) {
			int ld = n%10;
			x=x*10 + ld;
			n=n/10;
		}
		return x;
	}
}
