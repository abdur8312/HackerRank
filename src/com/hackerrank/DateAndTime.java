package com.hackerrank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateAndTime {
	
	public static void findDay(int year, int month, int day) {
		LocalDate ld = LocalDate.of(year, month, day);
		System.out.println(ld.getDayOfWeek());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();
		findDay(year, month, day);
	}
}
