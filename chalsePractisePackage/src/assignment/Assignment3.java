package assignment;
public class Assignment3 
{public static void main(String[] args)
	{
		System.out.println("===static without parameter===");
		familyinfos();
		System.out.println("===static with parameter===");
		familyinfos(5, "chalse", 15, 6.2f, 'M');
		System.out.println("=================================");
		System.out.println("===nonstatic without parameter===");
		Assignment3 A3 = new Assignment3(); A3.familyinfons();
		System.out.println("===nonstatic with parameter===");
		A3.familyinfons(5, "chalse", 15,6.2f , 'M');
	}
	public static void familyinfos ()                //without parameter 
	{
		int familymembers = 5;
		String surname = "chalse";
		int smallestmemberage = 15;
		float tallestmemberheight = 6.2f;
		char familyheadgender = 'M';
		System.out.println("family members are "+familymembers);
		System.out.println("family surname is "+surname);
		System.out.println("family smallest member age is "+smallestmemberage+ "year's old");
		System.out.println("family tallest member height is "+tallestmemberheight);
		System.out.println("family head gender is "+familyheadgender);
	}
	public static void familyinfos (int familymember,String surname,int smallestmemberage,float tallestmemberheight, char familyheadgender)
	// with parameter
	{
		System.out.println("family members are "+familymember);
		System.out.println("family surname is "+surname);
		System.out.println("family smallest member age is "+smallestmemberage+ "year's old");
		System.out.println("family tallest member height is "+tallestmemberheight);
		System.out.println("family head gender is "+familyheadgender);
		
	}
	public void familyinfons()             //without parameter
	{
		int familymembers = 5;
		String surname = "chalse";
		int smallestmemberage = 15;
		float tallestmemberheight = 6.2f;
		char familyheadgender = 'M';
		System.out.println("family members are "+familymembers);
		System.out.println("family surname is "+surname);
		System.out.println("family smallest member age is "+smallestmemberage+ "year's old");
		System.out.println("family tallest member height is "+tallestmemberheight);
		System.out.println("family head gender is "+familyheadgender);
	}
	public void familyinfons (int familymember,String surname,int smallestmemberage,float tallestmemberheight, char familyheadgender)
	// with parameter
	{
		System.out.println("family members are "+familymember);
		System.out.println("family surname is "+surname);
		System.out.println("family smallest member age is "+smallestmemberage+ "year's old");
		System.out.println("family tallest member height is "+tallestmemberheight);
		System.out.println("family head gender is "+familyheadgender);
	}
	
}
