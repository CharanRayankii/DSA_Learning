package com.Day1.BasicMath;

import java.util.Scanner;

//program to find whether the number is palindrome or not
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if(isPalindrome(n)) {
			System.out.println("palindrome number");
		}else {
			System.out.println("Not Palindrome Number");
		}
	
	}
	
	public static boolean isPalindrome(int n) {
		int x = 0;
		int copy = n;
		while(copy!=0) {
			int ld = copy%10;
			x = x*10+ld;
			copy = copy/10;
		}
		if(x == n) {
			return true;
			}
		return false;
	}

}
