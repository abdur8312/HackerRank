package com.hackerrank;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			n--;
			try {
				long a = sc.nextLong();
				System.out.println(a + " can be fitted in:");
				if(a >= -128 && a <= 127) {
					System.out.println("* byte\n* short\n* int\n* long");
				}
				else if(a >= -32768 && a <= 32767) {
					System.out.println("* short\n* int\n* long");
				}
				else if(a >= Math.pow(-2, 31) && a <= Math.pow(2, 31)-1) {
					System.out.println("* int\n* long");
				}
				else if(a >= Math.pow(-2, 63) && a <= Math.pow(2, 63)-1) {
					System.out.println("* long");
				}
			}catch(Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
			
		}
		
	}
	
}
