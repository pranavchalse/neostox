package logicalprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		
		String a=sc.next();
		String reverse="";
		for(int i=a.length()-1; i>=0;i--)
		{
			char t= a.charAt(i);
			reverse=reverse+t;	
			
		}
		if(a.equals(reverse))
		{
			System.out.println("reverse String is palindrome "+reverse);
		}
		else
		{
			System.out.println("reverse String is not palindrome "+reverse);
		}
	}

}
