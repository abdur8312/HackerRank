package com.hackerrank;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b = 1;
		while(sc.hasNext()) {
			String a = sc.nextLine();
			System.out.println(b + " " + a);
			b++;
		}
		sc.close();
	}
}
