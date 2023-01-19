package ControlStatement_1;

import java.util.Scanner;

public class FindQuotientAndRemainder {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1  = sc.nextInt();
		System.out.println("Enter number");
		int num2  = sc.nextInt();
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println("quotient is :"+quotient);
		System.out.println("remainder is :"+remainder);
	}

}
