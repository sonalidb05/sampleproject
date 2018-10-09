package com.sample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicatre {

public static int maxArray() {
	int arr[]= {10,45,67,13,45};
	 int index;
	 int max =arr[0];
	 for(index =0 ;index <arr.length;index++) {
		 
		 if(arr[index] > max) {
			 max =arr[index];
			 
		 }
	 }
	return max;
}
 public static int maximumArray() {
	 int arr []= {0,3,4,5,6,200};
	 int index =0;
	 int max=arr[0];
	 for(index=0;index<arr.length;index++) {
		 System.out.println(arr[index]+" : "+index);
		 if (arr[index]>max) {
			 max=arr[index];
		 } 
		 }return max;
			
	 
 }

public static String stringReverse(String string ) {
	  
	 String strReverse = "" ;
	for(int index = string.length()-1;index>=0;index--) {
		strReverse += string.charAt(index);
	}System.out.println("reverse string : "+strReverse);
	return string;
	
}

public static int primeNumber(int number) {
    int i;
    boolean flag =false ;
	for(i =2;i<number/2;i++) {
		if(number % i == 0) {
			flag =true ;
		}
		
	}
	if(flag==true)
		System.out.println("Number is not prime :"+number);
	else {
		System.out.println("number is prime :"+number);
	}
	return number;
}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("enter number : ");
		int num =scanner.nextInt();
		 primeNumber(num);
		
		// System.out.println("enter string here");
			//String st= scanner.nextLine();
			  //stringReverse(st) ;
		
		 //System.out.println("reverser :"+stringReverse(st));
		
		//System.out.println("maximum array element :"+maximumArray());
		//System.out.println("Array :"+maxArray());
	}
}

