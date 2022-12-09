package collectionuse;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		
		HashSet<Object> hs= new HashSet<>();
		
	System.out.println(	hs.add("Pune"));
	System.out.println(	hs.add("Pune"));
		hs.add(1234);
		hs.add('M');
		hs.add(12.12f);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println(hs);
		
//		hs.clear();
//		
//		System.out.println(hs.isEmpty());
//		
//		System.out.println(hs);
		
		Object hs1 = hs.clone();
		
		System.out.println(hs1);
		
		
		System.out.println(hs.contains(1234));
		
		
		System.out.println(hs.remove('M'));

		System.out.println(hs);
		
		
		System.out.println(hs.size());
		
		//for loop cant be used in set
		
		System.out.println("=========for each=============");
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		
		System.out.println("==========iterator=============");
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		
		
	}

}