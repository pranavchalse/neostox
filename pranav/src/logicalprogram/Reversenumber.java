package logicalprogram;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args)
	{
		//num=1234-->4321
		//int num=1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int a = sc.nextInt();
		//int to String
		String org = Integer.toString(a);
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
		char t = org.charAt(i);
		rev= rev+t;
		}
		// System.out.println(rev);
		int revNum = Integer.parseInt(rev);
		System.out.println("Given number is "+a);
		System.out.println("reverse number is "+revNum);

	}

}
