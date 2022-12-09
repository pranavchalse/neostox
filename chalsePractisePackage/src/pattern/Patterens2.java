package pattern;

public class Patterens2 {

	public static void main(String[] args)
	{
//		*****
//		 ****
//		  ***
//		   **
//		    *
		pattern1(5);
		pattern2(7);
		

	}
	
	public static void pattern1(int n)
	{
		for (int i=1; i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n; k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//	       *	
//		  ***
//		 *****
		public static void pattern2(int n)
		{
			for(int i=1; i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(" ");
				}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(" "+l);
			}
			System.out.println();
			}
			
		}
		
	}


