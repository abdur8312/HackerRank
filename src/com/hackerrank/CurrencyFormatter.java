package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		double d = sc.nextDouble();
		double res = Math.round(sc.nextDouble() * 100) / 100.0;
		System.out.println("US: $" + NumberFormat.getInstance(Locale.US).format(res));
		System.out.println("India: Rs." + NumberFormat.getInstance(new Locale("en", "IN")).format(res));
		System.out.println("China: \u00A5" + NumberFormat.getInstance(Locale.CHINESE).format(res));
		System.out.println("France: " + NumberFormat.getInstance(Locale.FRANCE).format(res) + " \u20AC");
	}

}
