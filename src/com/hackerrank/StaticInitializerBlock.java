package com.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	static int breadth, height;
	static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
		breadth = sc.nextInt();
		height = sc.nextInt();
	}
	
	public static void main(String[] args) throws Exception {
		if(breadth > 0 && height > 0) {
			System.out.println(breadth * height);
		}
		else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
}
