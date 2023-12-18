package com.hackerrank;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		String originalStr = "madam";
		int originalStrLen = originalStr.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i = originalStrLen - 1; i >= 0; i--) {
			sb.append(String.valueOf(originalStr.charAt(i)));
		}
		
		String result = sb.toString().equals(originalStr) ? "Yes" : "No";
		System.out.println(result);
		
	}
	
}
