package khushi;

public class AsdDsd {

	public static void main(String[] args) 
	{
		int i;
		int j;
		System.out.println("thread 1 is" );
		for (i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("thread 2 is");
		for (j=20; j>=11; j--)
		{
			System.out.println(j);
			
		}
	}

}
