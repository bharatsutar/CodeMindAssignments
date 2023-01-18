package ControlStatement;

import java.util.Scanner;

public class FindGreatestNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		System.out.println("Enter Number");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("Greatest Number Is :" +a);
		}else {
			System.out.println("Greatest Number Is :" +b);
		}
		
		
	}

}
