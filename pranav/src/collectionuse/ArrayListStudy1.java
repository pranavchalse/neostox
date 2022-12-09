package collectionuse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>a1= new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(3));
		System.out.println(a1.get(4));
		System.out.println(a1.get(5));
		System.out.println(a1.get(6));
		System.out.println("________________________________");
		
		System.out.println("*********for loop*********");
		System.out.println("*******static way*********");
		
		for(int i=0; i<=6; i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("________________________________");
		
		System.out.println("*********for loop*********");
		System.out.println("*******Dynamic way*********");
		
		for(int i=0; i<=a1.size()-1; i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("________________________________");
		
		System.out.println("*********for each*********");
		
		ArrayList<String>a2=new ArrayList<>();
		a2.add("pranav");
		a2.add("shivani");
		a2.add("vishwa");
		a2.add("anni");
		a2.add("kshitija");
		for( String each:a2)
		{
			System.out.println(each);
		}
		System.out.println("________________________________");
		
		System.out.println("*********Iterator*********");
		
		ArrayList<Float>a3=new ArrayList<>();
		a3.add(11.11f);
		a3.add(22.22f);
		a3.add(33.33f);
		a3.add(44.44f);
		a3.add(55.55f);
		a3.add(66.66f);
		
		Iterator<Float> it = a3.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("________________________________");
		
		System.out.println("*********List Iterator*********");
		
		ArrayList<Character>a4=new ArrayList<>();
		a4.add('a');
		a4.add('b');
		a4.add('c');
		a4.add('d');
		a4.add('e');
		a4.add('f');
		
		ListIterator<Character> lit = a4.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("--------------hasprevious-------------");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}

	}

}
