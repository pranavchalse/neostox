package collectionuse;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy1 {

	public static void main(String[] args) 
	{
		HashSet<Object> hs=new HashSet<>();
		System.out.println(hs.add("pranav"));
		System.out.println(hs.add("pranav"));
		System.out.println(hs.add("shivani"));
		System.out.println(hs.add("shivani"));
		hs.add('M');
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
		hs.add(true);
		hs.add(false);
		
		System.out.println(hs);
		
		System.out.println(hs.contains("pranav"));
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		for (Object h:hs)
		{
			System.out.println(h);
			
		}
		System.out.println("+++++++++++++++++++++++++++++++");

		Iterator<Object> h1 = hs.iterator();
		while(h1.hasNext())
		{
			System.out.println(h1.next());
		}
		
		
		
		
		
	}
}
