package ReadDataFromUser;

import java.util.Scanner;

public class DisplayTheSub {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		float num1 = sc.nextFloat();
		System.out.println("Enter 2nd number");
		float num2 = sc.nextFloat();
		
		float result = num1 - num2;
		System.out.println("Subtraction is :" +result);
	}

}
