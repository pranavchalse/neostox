package pattern;

public class Patterns {

	public static void main(String[] args) {
		
		
		pattern1(10);
		System.out.println("++++++++++++++");
		pattern2(5);
		System.out.println("++++++++++++++");
		pattern3(5);
		System.out.println("++++++++++++++");
		pattern4(6);
		pattern5(5);
		System.out.println("++++++++++++++");
		pattern6(5);
		System.out.println("++++++++++++++");
	}
	public static void pattern6 (int n)
	{
		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <=row; col++)
			{
				System.out.print(" "+col );
			}
			System.out.println();
		}
	}
	
	public static void pattern5 (int n)
	{
		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <=n-row+1; col++)
			{
				System.out.print(" "+col );
			}
			System.out.println();
		}
	}
	public static void pattern4 (int n)
	{
		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <=row; col++)
			{
				System.out.print(" "+col );
			}
			System.out.println();
		}
	}
	
	public static void pattern3 (int n)
	{
		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <=n-row+1; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2 (int n)
	{
		for (int row = 1; row <= n; row++)// for every row of the coln
		{
			for (int col = 1; col <= row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern1 (int n)
	{
		for (int row = 1; row <= n; row++)// for every row of the coln
		{
			for (int col = 1; col <= n; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
