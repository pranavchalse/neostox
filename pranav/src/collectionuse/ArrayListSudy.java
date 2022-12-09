package collectionuse;

import java.util.ArrayList;

public class ArrayListSudy 
{
	
	public static void main(String[] args)
	{
		ArrayList al= new ArrayList(); // created object of arryList
		al.add("Velocity");
		al.add(123);
		al.add('M');
		al.add("Velocity");
		al.add(123.123f);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add(false);
		
//		System.out.println(al);
//		al.add(2, 456);
//		System.out.println(al);
		
		System.out.println(al.size());
		//System.out.println(al.set(5, null));
		
		System.out.println(al.contains("Velocity"));
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf(null));
		
		System.out.println(al.lastIndexOf(true));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove(1));
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
//		ArrayList<String>al1= new ArrayList<>();
//		
//		al1.add("pranav");
//		al1.add("shivani");
//		al1.add("vishva");
//		al1.add("anni");
//		al1.add("kshitija");
//		al1.add(null);
//		System.out.println(al1);
	}
	
}