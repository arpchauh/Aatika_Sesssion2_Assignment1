package aatika;

import java.util.*;

public class Session2_Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		if(age>=18)
		{
		System.out.println("You are eligible to Vote");
		}
		else
		{
		System.out.println("Ypu are not eligible to vote");	
		}

	}

}
