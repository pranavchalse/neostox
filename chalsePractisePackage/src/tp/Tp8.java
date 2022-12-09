package tp;

public class Tp8 {

	public static void main(String[] args)
	{
		  String  [] name = {"shivani","vishwa","aniket","Pranav","khsitija"};
		  //static for loop
		  for(int i=0; i<=4;i++)
		  {
			  System.out.println(name[i]);
		  }
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		  for(int j=4; j>=0; j--)
		  {
			  System.out.println(name[j]);
		  }
		  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		  //dynamic for loop
		  for(int x=0; x<=name.length-1;x++)
		  {
			  System.out.println(name[x]);
		  }
		  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		  System.out.println(name.length);
		  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		  for(int y=name.length-1; y>=0; y--)
		  {
			  System.out.println(name[y]);
		  }
	}

}
