package com.hackerrank;

import java.util.Scanner;

public class IntIntoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		int input = sc.nextInt();
		if(input > -101 && input < 101) {
			result = String.valueOf(input);
			if(!result.isEmpty()) {
				System.out.println("Good job");
			}
		}
		else {
			System.out.println("Wrong answer");
		}
	}
}
