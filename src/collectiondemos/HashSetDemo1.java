package collectiondemos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

    public static void main(String[] args) {

        /**
         * Duplicate elements are not allowed
         * Insertion order is also not preserved
         * Elements will be inserted in HashSet using "Hashcode concept".
         * We can store different type of objects as It allows heterogeneous data.
         * We can also add "Null" values in HashSet.
         * As searching will be faster so we can prefer HashSet for Search operation.
         */

        HashSet hs = new HashSet(); /** default capacity 16 & Load Factor: 0.75  */

        HashSet a = new HashSet(100); /** capacity 100 Load Factor 0.75  */

        HashSet b = new HashSet(10, (float) 0.90); /** capacity 10 & Load Factor 0.90 & just dome the Typecast of an element  */

        HashSet<Integer> c = new HashSet<Integer>(); /** Suppose we want to store only numbers (homogeneous) */


        /** Add elements into linked list  */

        hs.add(100);
        hs.add("welcome");
        hs.add(15.5);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs); /** insertion order NOT Preserved  */

        System.out.println(hs.size()); //6

        /** remove  */

        hs.remove(15.5); //value
        System.out.println("After removing , new set:" + hs);

        /** 1) Retrieving value/object - Not possible to retrieve specific value
         *  2) Change the value - Not possible
         */

        /** hs.get(index);  */                  //incorrect

		/** hs.get("Element");  */              //incorrect

		/** hs.set(index, "X");  */             //incorrect

        /** contains() - searching  */

        System.out.println(hs.contains("welcome")); // true
        System.out.println(hs.contains("Python")); // false

        /** isEmpty()  */

        System.out.println(hs.isEmpty()); //false


        /** Reading elements from HashSet using for loop not possible - Because no index  */

        /** Reading elements from HashSet using for..each loop  */

        for (Object e : hs) {
            System.out.println(e);
        }

		/** Reading elements from HashSet using iterator() method  */

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }

}
