package com.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

import com.hackerrank.alphabets.Alphabets;

public class JavaAnagrams {
	
	public static HashMap<String, Integer> getAlphabetMap(){
        String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        HashMap<String, Integer> alphabetWithNumbers = new HashMap<String, Integer>();
        for(int i = 1; i <= alphabets.length; i++) {
            alphabetWithNumbers.put(alphabets[i-1], i);
        }
        return alphabetWithNumbers;
    }
    
    static boolean isAnagram(String a, String b) {
        int sum1 = 0, sum2 = 0;
        HashMap<String, Integer> hm = getAlphabetMap();
        System.out.println(hm);
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int n = hm.get(String.valueOf(c).toUpperCase());
            sum1 += n;
        }
        
        for(int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int n = hm.get(String.valueOf(c).toUpperCase());
            sum2 += n;
        }
        System.out.println("sum1 = " + sum1 + " & "+ "sum2 = " + sum2);
        return (sum1 == sum2) ? true : false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = "xyzw";//scan.next();
        String b = "xyxy";//scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	
}
