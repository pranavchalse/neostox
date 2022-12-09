package forAndWhileLoopEg;

public class ForLoopAssign {

	public static void main(String[] args) 
	{
		int j=0;
		int k=1;
		int l;
		for (int i=1; i<=10; i++)     //fibbonacci series
		{
			l=j+k;
			System.out.println(l);
			j=k;
			k=l;
		}
		System.out.println("===============================");
		for (char i='z'; i>='a'; i--)
		{
			System.out.println(i);
		}
		
	}
}
//0+1=1         0,1,2,3,4,5,6,7,8,9,10
//1+2=3
//3+2=5
//5+3=8
