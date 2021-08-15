package collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        /**
         * -  Always prefer whenever we have more number of search operation - So searching will be faster.
         * 1) Underline data structure is HashTable (HashCode)
         * 2) Insertion order is not preserved Because internally it will follow the HashTable concept.
         * 3) Duplicates "Keys" are not allowed. But Duplicates "Values" are allowed
         * ---- Compare with HashTable ----
         * 4) Null as "Key" allowed But only Once.
         * 5) Null as "Value" allowed - Once / multiple times. No restriction here.
         * 6) Non - Synchronized: Multiple threads can access the same method at a time.
         * 7) Not Thread safe. Because Multiple threads can access the same method at a time.
         * 8) Performance will be Faster.
         */

        HashMap hm = new HashMap(); /** initial capacity is 16, load factor 0.75  */

        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Scott");
        m.put(104, "Mary");
        m.put(105, "Tye");
        m.put(103, "X");
        m.put(106, "David");

        System.out.println(m); /** {101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}  */

        System.out.println(m.get(105));  //Tye

		System.out.println(m.remove(106));  /** remove pair from hashmap  */

        System.out.println(m.containsKey(101)); // true

        System.out.println(m.containsKey(106)); // false

        System.out.println(m.containsValue("Mary")); // True

        System.out.println(m.containsValue("Y"));  //false

        System.out.println(m.isEmpty()); //false

		System.out.println("=======================================");

		/** Returns all the Keys from the HashMap & Return type is Set because duplicate are not allowed */
		System.out.println(m.keySet());  /** returns all the keys as Set [101, 102, 103, 104, 105]  */

		for (Object i : m.keySet()) {
            System.out.println(i);
        }
        System.out.println("=======================================");

		/** Returns all the Values from the HashMap & Return type is Collection because duplicate are allowed  */
		System.out.println(m.values()); /** returns all the values as Collection  [John, David, X, Mary, Tye]  */

        for (Object i : m.values()) {
            System.out.println(i);
        }
        System.out.println("=======================================");

		/** "keySet()" with get(i) - Returns Keys & corresponding Values both  */
		for(Object i: m.keySet())
         {
         	System.out.println(i +"    "+ m.get(i));
         }

		System.out.println("=======================================");

		/**
         * "Entry" is interface and getting all the keys and values from Entry method.
         * "entrySet()" - Returns each Entry from the HashMap along with Keys & Values
         *  Map.Entry is Type.
         */
		for(Map.Entry entry:m.entrySet()) // 101  x
		 {
		 	System.out.println(entry.getKey()+"    "+entry.getValue());
		 }

		System.out.println("=======================================");

		/** Same thing implement using - iterator()  */

        Set s = m.entrySet();

        Iterator itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Entry) itr.next();   // 101 x  entry
            System.out.println(entry.getKey() + "      " + entry.getValue());

        }

    }


}
