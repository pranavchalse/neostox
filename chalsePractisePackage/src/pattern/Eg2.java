package pattern;

public class Eg2 {

	public static void main(String[] args) 
	{	
		System.out.println("pattern 1");
		//    *
		//   * *
		//  * * *
		// * * * *
		//* * * * *

		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{	if(j>0)	
				{System.out.print(" ");}
				else
				{System.out.print("*");}
			}
			for(int k=1;k<=i;k++)
			{ 
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("pattern 2");
		
		//* * * * *
		// * * * *
		//  * * *
		//   * *
		//    *
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<=i;j++)
			{if(j>0)	
			{System.out.print(" ");}
			else
			{System.out.print("*");}
			}
			for(int k=5;k>=i;k--)
			{ 
				System.out.print(" *");
			}
			System.out.println();
			}	
		System.out.println("pattern 3");
	
			//	  *
			//   * *
			//  * * *
			// * * * *
			//* * * * *
			//* * * * *
			// * * * *
			//  * * *
			//   * *
			//    *
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{	if(j>0)	
				{System.out.print(" ");}
				else
				{System.out.print("*");}
			}
			for(int k=1;k<=i;k++)
			{ 
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<=i;j++)
			{if(j>0)	
			{System.out.print(" ");}
			else
			{System.out.print("*");}
			}
			for(int k=5;k>=i;k--)
			{ 
				System.out.print(" *");
			}
			System.out.println();
			}	
	
		System.out.println("pattern 4");
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for(int l=2;l<=i;l++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
		System.out.println("pattern 5");
	
		//*********
		// *******
		//  *****
		//   ***
		//    *
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
		for(int k=5;k>=i;k--)
		{
			System.out.print("*");
		}
		for(int l=4;l>=i;l--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}	
	}