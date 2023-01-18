package ControlStatement;

import java.util.Scanner;

public class CheckAlphabets {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char c = sc.next().charAt(0);
		if(c>='a' && c<='z') {
			System.out.println("lowercase character");
		}else if(c>='A' && c<='Z') {
			System.out.println("Uppercases character");
		}else {
			System.out.println("Invalid input");
		}
	}

}
