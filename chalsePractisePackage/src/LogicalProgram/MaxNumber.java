package LogicalProgram;

public class MaxNumber {

	public static void main(String[] args)
	{
		int a =110;
		int b =200;
		int c =300;
		int d =40;
		
		
		if (a>b && a>c)
		{
			System.out.println("largetst no is "+a);
		}
		else if(b>c && b>d)
		{
			System.out.println("largest no is "+b);
		}
		else if (c>a && c>b && c>d)
		{
			System.out.println("largest no is "+c);
		}
		else
		{
			System.out.println("largest no is "+d);
		}
	}
}
