package com.hackerrank;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int base = 2;
		while(lines > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int exp = sc.nextInt();
			int result = 1;
			int d = a + b;
			System.out.print(d + " ");
			for(int j = 1; j < exp; j++) {
				result *= base;
				d += (result * b);
				System.out.print(d + " ");
			}
			lines--;
			System.out.println();
		}
		
	}
	
}
