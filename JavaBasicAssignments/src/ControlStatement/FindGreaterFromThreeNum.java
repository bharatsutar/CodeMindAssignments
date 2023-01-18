package ControlStatement;

import java.util.Scanner;

public class FindGreaterFromThreeNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("the greater number is :"+a);
		}else if(b>a && b>c) {
			System.out.println("the greater number is :"+b);
		}else {
			System.out.println("the greater number is :"+c);
		}
		
	}

}
