package com.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

import com.hackerrank.alphabets.Alphabets;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		Alphabets alp = new Alphabets();
		HashMap<String, Integer> alphabetWithNumbers = alp.getAlphabetMap();
//		String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		
		String A = "hello";//sc.next();
		String B = "java";//sc.next();
		System.out.println(A.length() + B.length());

//		for(int i = 1; i <= alphabets.length; i++) {
//			alphabetWithNumbers.put(alphabets[i-1], i);
//		}
		System.out.println(alphabetWithNumbers);
		String firstLetter = A.substring(0, 1).toUpperCase();
		String secLetter = B.substring(0, 1).toUpperCase();
		if(alphabetWithNumbers.get(firstLetter) > alphabetWithNumbers.get(secLetter)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		builder.append(Character.toUpperCase(A.charAt(0))).append(A.substring(1)).append(" ")
				.append(Character.toUpperCase(B.charAt(0))).append(B.substring(1));
		System.out.println(builder.toString());
		
	}
	
}
