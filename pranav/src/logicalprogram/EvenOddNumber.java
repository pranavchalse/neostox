package logicalprogram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int a = sc.nextInt();
		if(a==0)
		{
			System.out.println("the given no "+a+" neither odd or even");
		}
		else if(a%2==0)
		{
			System.out.println("the given no "+a+" is even");
		}
		else
		{
			System.out.println("the given no "+a+" is odd");
			
		}
	}
	
}
