package pattern;

public class Eg1 {

	public static void main(String[] args) {
	System.out.println("pattern 1");	
			//		*
			//		**
			//		***
			//		****
			//		*****
			//		******
			for(int i=1;i<=6;i++)
			{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
	
		}
	System.out.println("pattern 2");	

		 	//		******
			//		*****
			//		****
			//		***
			//		**
			//		*
			for(int i=1;i<=6;i++)
			{
				for(int j=6;j>=i;j--)
				{
				System.out.print("*");
				}
				System.out.println();
			}
	System.out.println("pattern 3");
			//		*
			//		**
			//		***
			//		****
			//		*****
			//		******
			//		*****
			//		****
			//		***
			//		**
			//		*
			for(int i=1;i<=6;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
			for(int k=1;k<=5;k++)
			{
				for(int l=5;l>=k;l--)
				{
					System.out.print("*");
				}
				System.out.println();}
	System.out.println("pattern 4");
			//	   *
			//    **
			//   ***
			//  ****
			// *****
			//******
			for(int i=1;i<=6;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
					
				}
				System.out.println();
				}
			
	System.out.println("pattern 5");
			//*****
			// ****
			//  ***
			//   **
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
				System.out.println();
			}

	System.out.println("pattern 6");
			//     *
			//    **
			//   ***
			//  ****
			// *****
			//******
			// *****
			//  ****
			//   ***
			//    **
			//     *
			
			for(int i=1;i<=6;i++)
			{
				for(int j=6;j>=i;j--)
				{System.out.print(" ");}
			for(int k=1;k<=i;k++)
			{System.out.print("*");}
			System.out.println();}
			for(int i=1;i<=6;i++)
			{
				for(int j=1;j<=i;j++)
				{System.out.print(" ");}
			for(int k=6;k>=i;k--)
			{System.out.print("*");}
			System.out.println();
			
			}
	
	System.out.println("pattern 7");
	
			//******
			//*****
			//****
			//***
			//**
			//*
			//**
			//***
			//****
			//*****
			//******
			
			for(int i=1;i<=6;i++)
			{
				for(int j=6;j>=i;j--)
				{
				System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1;i<=6;i++)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print("*");
				}
				System.out.println();
			}
			
	System.out.println("pattern 8");
			
			//* * * * * *
			//* * * * *
			//* * * *
			//* * *
			//* *
			//*
			//* *
			//* * *
			//* * * *
			//* * * * *
			//* * * * * *
			
			for(int i=1;i<=6;i++)
			{
				for(int j=6;j>=i;j--)
				{
				System.out.print(" *");
				}
				System.out.println();
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=0;j<=i;j++)
				{
				System.out.print(" *");
				}
				System.out.println();
			}	
			
	}
	}