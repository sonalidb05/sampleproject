package com.java.selenium;

import java.util.Scanner;

public class SampleDemo {

	

	public void addition(int a,int b) {
		int c =a+b;
		System.out.println("sum : "+c);
	}
	
	
	public static void main(String[] args) {
		SampleDemo demo = new SampleDemo();
		demo.addition(12, 23);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value of a and b ");
		int ab = scanner.nextInt();
		int bc =scanner.nextInt();
		
		demo.addition(ab, bc);
		
		
	
	}
	
	
}

class Sample{
	
	/*public static void addition(int a,int b) {
		int c= a+b;
		System.out.println("sum :"+c);
	}
	*/
	
	
}