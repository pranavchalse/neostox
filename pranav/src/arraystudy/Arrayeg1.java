package arraystudy;

public class Arrayeg1 {

	public static void main(String[] args) 
	{
		int id []=new int[5];
		id[0]=10;
		id[1]=11;
		id[2]=12;
		id[3]=13;
		//id[4]=14;
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id[3]);
		System.out.println(id[4]);
		System.out.println("++++++++++++++++++++++++++++++++++");
		//static code 
		for (int i=0;i<=4;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		for (int i=0; i<=id.length-1; i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++");
		for (int i=id.length-1; i>=0;i--)
		{
			System.out.println(id[i]);
		}
	}

}













//









