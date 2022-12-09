package gloANDvariable;

public class Eg1 
{
	public static void main(String[] args) 
	{
		Eg1sub EM = new Eg1sub();
		EM.name ="pranav";
		EM.id = 1111;
		EM.salary = 55000F;
		EM.gender = 'M';
		EM.EMP();
		System.out.println("++++++++++++++++++++++++++++++++");
		EM.name ="RUPALI";
		EM.id = 2222;
		EM.salary =60000F;
		EM.gender = 'F';
		EM.EMP();
	}
}
