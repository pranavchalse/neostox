package forLoopStudy;

public class DoWhileLoopStudy{

	public static void main(String[] args)
	{
	//I want to print Hello 5 times
	int i=1;
	do
	{
	System.out.println("Hello");
	i++;//2,3,4,5,6
	}
	while(i<=5);
	System.out.println("=====================");
	
	//=================================
	// I want to print table of 4
	//start at-->4 End at-->40 updation-->v=v+4
	int v=4;
	do
	{
	System.out.println(v);
	v=v+4;
	}
	while(v<=40);
	System.out.println("=====================");
	
	// I want to print table of 4 in reverse order
	//start at-->40 End at-->4 updation-->m=m-4
	int m=40;
	do
	{
	System.out.println(m);
	m=m-4;
	}
	while(m>=4);
	}

}
