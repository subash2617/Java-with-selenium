package javaprogram;

import java.util.Scanner;

public class UserInput {
	
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// simple add 
		System.out.println("Enter a Value :");
		int a = read.nextInt();
		
		System.out.println("Enter b Value :");
		int b = read.nextInt();
				
		int sum = a+b;
		System.out.println("The sum of value is :"+sum);
		
		// input String Type
		System.out.println("Enter the message to be print :");
		System.out.println(read.next());
	}
}
/*
   Output
Enter a Value :
30
Enter b Value :
20
The sum of value is :50
Enter the message to be print :
ThankYou
ThankYou
*/
