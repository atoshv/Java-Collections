package collectiondemos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {

		/**
		 * -  Always prefer whenever we have more number of search operation - So searching will be faster.
		 * 1) Underline data structure is HashTable (HashCode)
		 * 2) Insertion order is not preserved Because internally it will follow the HashTable concept.
		 * 3) Duplicates "Keys" are not allowed. But Duplicates "Values" are allowed
		 * ---- Compare with HashMap ----
		 * 4) Null as "Key" not allowed.
		 * 5) Null as "Value" not allowed.
		 * 6) Synchronized: Only One Thread can access the same method at a time. Another should be in wait state.
		 * 7) Thread safe. Because Multiple threads Can Not access the same method at a time. Only one can access at a time.
		 * 8) Performance will be Slower.
		 */

		Hashtable t1=new Hashtable();  /** initial capacity is 11, load factor 0.75  */

		Hashtable t2=new Hashtable(15);  /** create hashtable object with some capacity  */
		Hashtable t3=new Hashtable(20, 90);
		
		Hashtable <Integer,String> t= new Hashtable<Integer,String>();

		t.put(101,"John");
		t.put(102,"David");
		t.put(103,"Smith");
		//t.put(null,"X"); //NullPointerException
		//t.put(104, null); //NullPointerException
		
		System.out.println(t); // {103=Smith, 102=David, 101=John}
			
		System.out.println(t.get(103)); //Smith
		
		t.remove(103);
		System.out.println(t); //{102=David, 101=John}
		
		System.out.println(t.containsKey(102)); //true
		System.out.println(t.containsKey(105)); //false
		
		System.out.println(t.containsValue("David")); //true
		System.out.println(t.containsValue("Y")); //False
		
		System.out.println(t.isEmpty());//false
		
		System.out.println(t.keySet());  //[102, 101]
		System.out.println(t.values()); //[David, John]

		System.out.println("=======================================");

		for(int k:t.keySet())
		{
			System.out.println(k+"   "+t.get(k));
		}
		System.out.println("=======================================");

		//Entry specific methods...
		
		for(Map.Entry entry:t.entrySet())    // (key, value)
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("=======================================");

		//iterator()
		
		Set s=t.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();   //(101,x)
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		
	}

}




