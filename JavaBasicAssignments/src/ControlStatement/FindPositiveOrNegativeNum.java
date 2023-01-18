package ControlStatement;

import java.util.Scanner;

public class FindPositiveOrNegativeNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check positive or negative");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}
	}

}
