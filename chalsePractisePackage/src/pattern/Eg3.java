package pattern;

public class Eg3 {

	public static void main(String[] args) 
	{
	System.out.println("=========");
	System.out.println("pattern 1");
	System.out.println("=========");
		//*******
		for(int i=1;i<=6;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	System.out.println("=========");
	System.out.println("pattern 2");
	System.out.println("=========");
		//*
	  	//*
		//*
		//*
		//*
		//*

		for(int i=1;i<=6;i++)
		{
			System.out.println("*");
		
		}
	System.out.println("=========");
	System.out.println("pattern 3");
	System.out.println("=========");
		//*******
		//*******
		//*******
		//*******
		//*******
		//*******
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{System.out.print("*");}
			System.out.println();
		}
	System.out.println("=========");
	System.out.println("pattern 4");
	System.out.println("=========");
		//******
		//*    *
		//*    *
		//*    *
		//*    *
		//******
		
		for(int i=1;i<=6;i++)
		{System.out.print("*");}
		System.out.println();
		for(int i=1;i<=4;i++)
		{System.out.print("*    *");
		System.out.println();}
		for(int i=1;i<=6;i++)
		{System.out.print("*");}
		System.out.println();
		
	System.out.println("=========");
	System.out.println("pattern 5");
	System.out.println("=========");
		
		for(int i=1;i<=6;i++)
		{System.out.print(i);}
		System.out.println();
		for(int i=1;i<=4;i++)
		{System.out.print(i);
		System.out.print("    "+i);
		System.out.println();}
		for(int i=1;i<=6;i++)
		{System.out.print(i);}
		System.out.println();
		
	System.out.println("=========");
	System.out.println("pattern 6");
	System.out.println("=========");
	
	//*     *
	// *   *
	//  * *
	//   *
	//  * *
	// *   *
	//*     *
		
	
	
	}}