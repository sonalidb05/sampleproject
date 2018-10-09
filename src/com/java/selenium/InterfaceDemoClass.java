package com.java.selenium;



public class InterfaceDemoClass implements MyDemoInterface{

	@Override
	public void addition() {
	System.out.println("welcome to  interface----");
		
	}

	@Override
	public void diff(int a, int b) {
		// TODO Auto-generated method stub
		int c =a-b;
		System.out.println("diff :"+c);
	}
public static void main(String[] args) {
	InterfaceDemoClass class1 = new InterfaceDemoClass();
	class1.addition();
	class1.diff(10, 20);
}
	

	
}