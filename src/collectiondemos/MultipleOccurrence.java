package collectiondemos;
import java.util.HashMap;
import java.util.Iterator;

public class MultipleOccurrence {
	
	static void findDuplicateString(String str)
	{
	HashMap<String, Integer> hm = new HashMap<>();
	String[] s = str.split(" ");
	for (String a : s)
	{
		if (hm.get(a) != null)
		{
			hm.put(a, hm.get(a) + 1);
		}
		else
		{
		hm.put(a,1);
		}
	}
		System.out.println(hm);
		
	/** printing only duplicate strings */
		Iterator <String> it = hm.keySet().iterator();
		while (it.hasNext())
		{
			String temp = it.next();
			if (hm.get(temp) > 1)
			{
				System.out.println("The word "+temp+" appeared "+hm.get(temp)+" number of times");
			}
		}
		
	}
	
	static void findDuplicateCharacters(String str)
	{
		HashMap <Character, Integer> hm = new HashMap<>();
		for (int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			
			if (hm.get(c) !=null)
			{
				hm.put(c, hm.get(c) +1);
			}
			else
			{
				hm.put(c, 1);
			}
			
		}
		
		System.out.println(hm);
		
		/** printing only duplicate characters */
		
		Iterator <Character> it = hm.keySet().iterator();
		
		while (it.hasNext())
		{
			Character temp = it.next();
			if (hm.get(temp) > 1)
			{
				System.out.println("The character "+temp+" appeared "+hm.get(temp)+" number of times");
			}
		}
		
	}
	
	
	public static void main (String args[])
	{
		findDuplicateString("hi Atosh hi and How are you doing How");
		findDuplicateCharacters("ABCDAEFGHB");
	}
	
}
