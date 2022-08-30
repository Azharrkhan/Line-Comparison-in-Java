package com.bl.linecomparison;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class LineComparisionComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program");
		
		Scanner sc = new Scanner(System.in);
		
//Let consider the end points of the first line are (x1 ,y1) and (x2, y2)
		
		System.out.println("Enter x1, y1");
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println(x1 + "," + y1);
		
		System.out.println("Enter x2, y2");
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println(x2 + "," + y2);
		
//Let consider the end points of the first line are (x3 ,y3) and (x4, y4)
		
		System.out.println("Enter x3, y3");
		
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.println(x3 + "," + y3);
		
		System.out.println("Enter x4, y4");
		
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		System.out.println(x4 + "," + y4);
		
		int length1 = (int) Math.sqrt(Math.pow((double) (x2-x1),2) + Math.pow((double) (y2-y1),2));
		
		System.out.println("Length of first line is : "  + length1);
		
		int length2 = (int) Math.sqrt(Math.pow((double) (x4-x3),2) + Math.pow((double) (y4-y3),2));
		
		System.out.println("Length of second line is : "  + length2);
		
		System.out.println("length1 is equal to length2 = " + (length1 == length2));
	}
}
