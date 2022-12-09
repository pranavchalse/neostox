package assignment;

public class PraPara {

	public static void main(String[] args) 
	{
		System.out.println("university of CHALSE");
		departmet();
		PraParaSub.stuInfo("pranav", 1, 'M', "O+");
		System.out.println("+++++++++++++++++++++");
		PraParaSub.stuInfo("meena", 2, 'F', "0-");
		System.out.println("+++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++");
		PraPara AA = new PraPara(); 
		AA.department1();
		PraParaSub AB = new PraParaSub(); 
		AB.stuInfo1("kalpesh", 3, 'M', "B+");
		System.out.println("+++++++++++++++++++++");
		AB.stuInfo1("shital", 4, 'F', "A+");
	}
	public static void departmet ()
	{
		System.out.println("Chemistry department");
	}
	public void department1()
	{
		System.out.println("Physics department");
	}

}
