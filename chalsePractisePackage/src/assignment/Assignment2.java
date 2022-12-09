package assignment;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		System.out.println("===============SAME CLASS====================");
		Assignment2 A2 = new Assignment2(); //same class
		System.out.println("======STUDENT DETAIL OF PUNE UNIVERSITY======");
		A2.studetntInfo("PRANAV CHALSE", 1111, 75F, 'M', 166d, "Electronics");
		System.out.println("=============================================");
		A2.studetntInfo("lOKESH CHALSE", 2222, 50f, 'M', 166d, "PHYSICS");
		System.out.println("===============SAME CLASS END================");
		System.out.println("=============================================");
		System.out.println("===============ANOTHER CLASS=================");
		Assignment2sub A3 = new Assignment2sub();//another class
		A3.studetntInfo("ADITI CHASLE", 3333, 60F, 'F', 150D, "CHEMISTRY");
		System.out.println("=============================================");
		A3.studetntInfo("AJINKYA CHASLE", 4444, 70F, 'M', 145D, "BIO");
		System.out.println("===============ANOTHER CLASS END=============");
	}
	public void studetntInfo(String Name,int PRN,float Weight ,char Gender ,double Height,String Name1)
	{
		System.out.println("student name is "+Name);
		System.out.println("prn is "+PRN);
		System.out.println("weight is "+Weight);
		System.out.println("gender is "+Gender);
		System.out.println("height is "+Height);
		System.out.println("dept name is "+Name1);
	}
}
