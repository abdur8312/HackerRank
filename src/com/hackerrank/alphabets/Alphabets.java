package com.hackerrank.alphabets;

import java.util.HashMap;

public class Alphabets {
	
	String[] capitalAlphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	public HashMap<String, Integer> getAlphabetMap(){
		HashMap<String, Integer> alphabetWithNumbers = new HashMap<String, Integer>();
		for(int i = 1; i <= capitalAlphabets.length; i++) {
			alphabetWithNumbers.put(capitalAlphabets[i-1], i);
		}
		return alphabetWithNumbers;
	}
	
	public void check() {
		if('a' > 'A') {
			System.out.println("true");
		}
	}
	
}
