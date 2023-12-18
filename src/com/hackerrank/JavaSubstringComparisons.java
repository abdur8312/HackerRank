package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";//sc.next();
		int k = 1;//sc.nextInt(); 
		sc.close();
		System.out.println(getSmallestAndLargest(s, k));
		
	}
	
	public static String getSmallestAndLargest(String s, int k) {
		int kLen = k;
		int lenOfSplitS = s.length() - k + 1;
		String[] splitS = new String[lenOfSplitS];
		for(int i = 0; i < lenOfSplitS; i++) {
			splitS[i] = s.substring(i, k++);
		}
		
		for(int i = 0; i < lenOfSplitS; i++) {
			int g = 0;
			for(int j = 1; j < lenOfSplitS; j++) {
				int charIndex = 0;
				if(splitS[g].charAt(charIndex) > splitS[j].charAt(charIndex)) {
					String temp1 = splitS[g];
					splitS[g] = splitS[j];
					splitS[j] = temp1;
				}
				if(kLen > 1) {
					if(splitS[g].charAt(charIndex) == splitS[j].charAt(charIndex)) {
						charIndex++;
						while(splitS[g].charAt(charIndex) == splitS[j].charAt(charIndex)) {
							if(charIndex >= k) {
								break;
							}
							charIndex++;
						}
						
						if(splitS[g].charAt(charIndex) > splitS[j].charAt(charIndex)) {
							String temp1 = splitS[g];
							splitS[g] = splitS[j];
							splitS[j] = temp1;
						}
					}
				}
				g++;
				if(g >= lenOfSplitS) {
					break;
				}
			}
		}
		return splitS[0] + "\n" + splitS[splitS.length - 1];
	}
	
}
