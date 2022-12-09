package finaluse;

public class Finalu 
{
	public static void main(String[] args) 
	{
		Finalu f = new Finalu();
		f.add(10);
		
	}
	public  void add(final int a)
	{
		//a = 10;
		int add = a+10;
				System.out.println(add);
		}
	/* use of final means once the assigning is done, double assigning is not possible 
	 * there are three types of final
	 * a)final variable
	 * b)final method 
	 * c)final class
	 * -----------------------------------------------
	 * a)final variable 
	 * onnce the variable is final then there is no assigning is possible for that variable 
	 * -----------------------------------------------
	 * b)final method
	 * once the method get final you can not share that method in another class
	 * -----------------------------------------------
	 * c)final class
	 * once the class is final that class never be extend 
	 * 
	 * */
	
}