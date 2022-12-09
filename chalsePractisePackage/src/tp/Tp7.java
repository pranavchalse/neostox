package tp;

public class Tp7 {

	public static void main(String[] args) 
	{
		float weight[]= new float[5];
		weight[0]=22.22f;
		weight[1]=33.33f;
		weight[2]=44.44f;
		weight[3]=55.55f;
		weight[4]=66.66f;
		
		System.out.println(weight[0]);
		System.out.println(weight[1]);
		System.out.println(weight[2]);
		System.out.println(weight[3]);
		System.out.println(weight[4]);
		//System.out.println(weight[5]); exception
		System.out.println("+++++++++++++++++++++++++++++++++");
		for(int i=0;i<=4;i++)
		{
			System.out.println(weight[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		for(int i=0; i<=weight.length-1; i++)
		{
			System.out.println(weight[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		
		for(int i=weight.length-1;i>=0;i--)
		{
			System.out.println(weight[i]);
		}
	}
}
