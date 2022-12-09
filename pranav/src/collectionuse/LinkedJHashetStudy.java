package collectionuse;



import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedJHashetStudy {

	public static void main(String[] args)
	{
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
		
		hs.add("pranav");
		hs.add("pranav");
		hs.add("shivani");
		hs.add('M');
		hs.add(null);
		hs.add(null);
		hs.add(true);
		hs.add(false);
		
		//hs.clear();
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("===============================");
		for(Object h2:hs) 
		{
			System.out.println(h2);
		}
		System.out.println("===============================");
		Iterator<Object> h3 = hs.iterator();
		while(h3.hasNext())
		{
			System.out.println(h3.next());
			
		}
		
		

	}

}
