package com.java.selenium;

public class AbstractDemoChildClass extends AbstractDemoClass {

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		//super.display();
		System.out.println("inside child display---");
	}
	@Override
	public void abstractDisplayMethod() {
	System.out.println("inside child class");
		
	}

	public static void main(String[] args) {
		AbstractDemoChildClass abstractDemoChildClass = new AbstractDemoChildClass();
//		abstractDemoChildClass.abstractDisplayMethod();
		
		
		abstractDemoChildClass.display();
	}

}
