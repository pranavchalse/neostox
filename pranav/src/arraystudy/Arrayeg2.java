package arraystudy;

public class Arrayeg2 {

	public static void main(String[] args) 
	{
		char name[] ={'p','r','a','n','a','v',' ','c','h','a','l','s','e'};
		//using dynamic for loop in forward direction 
		for(int i=0; i<=name.length-1; i++)
		{
			System.out.print(name[i]);
		}
		System.out.println( );
		//using dynamic for loop in reverse direction 
		System.out.println("in reverse manner");
		for(int j=name.length-1; j>=0; j--) 
		{
			System.out.print(name[j]);
		}
	}

}
