package collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {

		/**
		 * Duplicate elements are not allowed BUT Insertion order is preserved.
		 * Elements will be inserted in HashSet using "Hashcode concept".
		 * We can store different type of objects as It allows heterogeneous data.
		 * We can also add "Null" values in HashSet.
		 * As searching will be faster so we can prefer HashSet for Search operation.
		 */

		LinkedHashSet <Integer> hsInt = new LinkedHashSet<Integer>(); /** homogeneous  */
		HashSet hs = new HashSet();  /** Hashset */

		LinkedHashSet lset = new LinkedHashSet(); /** Linked HashSet  */

		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add("Atosh");
		
		System.out.println(lset); //[400, 100, 500, 200, 300]

	}

}
