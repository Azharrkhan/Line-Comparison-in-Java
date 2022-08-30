package com.bl.linecomparison;

import java.util.Scanner;

public class LineComparisionComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program");
		System.out.println("Enter x1, y1");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println(x1 + "," + y1);
		
		System.out.println("Enter x2, y2");
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println(x2 + "," + y2);
		
		int length = (int) Math.sqrt(Math.pow((double) (x2-x1),2) + Math.pow((double) (y2-y1),2));
		
		System.out.println("Length is : "  + length);
	}
}
