package stringUSe;

public class StringMethohds {

	public static void main(String[] args) 
	{
		//1)length @111
		String a ="aniket";
		System.out.println(a.length());
		int name = a.length();
		System.out.println(name);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//2&3)String uppercase/lowercase;
		String b = "shivani kale";
		System.out.println(b.toUpperCase());
		String name1 = b.toUpperCase();
		System.out.println(name1);
		String c = "SHIVANI KALE";
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println(c.toLowerCase());
		String name2 = c.toLowerCase();
		System.out.println(name2);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//4)equals 5)equalsignore
		String d = "pranav";
		String e = "pranav";
		String f = "PRANAV";
		String g = new String ("pranav");
		String h = new String ("PRANAV");
		String i = new String ("chalse");
		System.out.println(d==e);
		System.out.println(d==f);
		System.out.println(d==g);
		System.out.println(g.equals(e));
		System.out.println(h.equals(f));
		System.out.println(i.equals(g));
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//6)conatins 
		String j = "vishvajeet";
		System.out.println(j.contains("jee"));
		System.out.println(j.contains("vt"));
		boolean name3 = j.contains("eet");
		System.out.println(name3);
		boolean name4 = j.contains("jt");
		System.out.println(name4);
		//===============================================
		
		//7)isempty;
		String k = " ";
		System.out.println(k.isEmpty());
		boolean name5 = k.isEmpty();
		System.out.println(name5);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//8)isblank
		String l = " ";
		System.out.println(l.isBlank());
		boolean name6 = l.isEmpty();
		System.out.println(name6);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//9)CharAt
		String m ="pranav";
		System.out.println(m.charAt(3));
		char name7 = m.charAt(4);
		System.out.println(name7);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//10)endswith
		String n = "shivani";
		System.out.println(n.endsWith("ani"));
		boolean name8 = n.endsWith("ai");
		System.out.println(name8);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//11)startswith
		String o = "aniket";
		System.out.println(o.startsWith("ani"));
		boolean name9 = o.startsWith("ai");
		System.out.println(name9);
		System.out.println("+++++++++++++++++++++++++++");
		//===============================================
		
		//12)substring
		String p = "i love pune";
		System.out.println(p.substring(2));
		System.out.println(p.substring(2, 6));
		 String name10 = p.substring(7, 11);
		System.out.println(name10);
		//===============================================
		System.out.println("+++++++++++++++++++++++++++");
		
		//13)indexof
		String q = "hi hello how";
		System.out.println(q.indexOf('l'));
		System.out.println(q.indexOf('h',4));
		//===============================================
		System.out.println("+++++++++++++++++++++++++++");
		//14)lastindexof
		System.out.println(q.lastIndexOf('h'));
		//===============================================
		System.out.println("+++++++++++++++++++++++++++");
		
		//15)concat
		String r = "best";
		String s = "friend";
		System.out.println(r.concat(s));
		System.out.println(r.concat("pranav"));
		//===============================================
		System.out.println("+++++++++++++++++++++++++++");
		
		//16)replace
		String t = "unemployed";
		System.out.println(t.replace("un","in"));
		//===============================================
		System.out.println("+++++++++++++++++++++++++++");
		
	    //17)split
		//we study later in array

	}

	
}
