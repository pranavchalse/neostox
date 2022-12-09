package khushi;

public class OddEven {

	public static void main(String[] args)
	{
		int i;
		int j;
		System.out.println("thread 1= even number is ");
		for (j=1; j<=10; j++)
		if (j% 2==0)
		{
			System.out.println(j);
		}
		System.out.println("+++++++++++++++++++++++++++==");
		System.out.println("thread 2= odd number is ");
		for (i=100; i<=110; i++)
			if(i% 2!= 0)
		{
			System.out.println(i);
		}
		
	}

}
