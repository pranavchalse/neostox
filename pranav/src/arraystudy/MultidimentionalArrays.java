package arraystudy;

public class MultidimentionalArrays {

	public static void main(String[] args) 
	{
		//using new keyword
		char alphabets[][] = new char[2][2];
		alphabets [0][0]='a';
		alphabets [0][1]='b';
		alphabets [1][0]='c';
		alphabets [1][1]='d';
		
		System.out.println("frwd:-");
		for (int i=0; i<=alphabets.length-1; i++)
		{
			for(int j=0; j<=alphabets.length-1; j++)
			{
				System.out.print(alphabets[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++");
		
		//for reverse
		System.out.println("reverse:-");
		for (int i=alphabets.length-1; i>=0; i--)
		{
			for(int j=alphabets.length-1; j>=0; j--)
			{
				System.out.print(alphabets[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++");
		
		//without using new keyword
		//matrix of 3*2
		System.out.println("frwd:-");
	String name [][] ={{"pranav  ","shivani      "},{"aniket  ","vishwajeet   "},{"kshitija","**********   "}};	
		for (int i=0; i<=name.length-1; i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("reverse:-");
		for (int i=name.length-1; i>=0; i--)
		{
			for(int j=1; j>=0; j--)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
	}

}
