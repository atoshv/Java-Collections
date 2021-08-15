package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        /**
         * 1) Growable in nature. At the runtime based upon the values size will be increased.
         * - By default 10 locations are provided but As many as objects / elements adding into the LinkedList the size will be increased.
         * 2) Insertion order is also preserved
         * 3) Duplicates are allowed.
         * 4) LinkedList is not homogeneous. It Hold heterogeneous collections of objects.
         * - Example: a & b are homogeneous & c is heterogeneous.
         * a) LinkedList <Integer> l=new LinkedList<Integer>();       only accepts Integers
         * b) LinkedList <String> l=new LinkedList<String>();         only accepts Strings
         * c) List l=new LinkedList(); 								  accepts all data type values
         */

        /**
         *  LinkedList:
         * 1) When we have more number of Insertion / Deletion operation - Prefer LinkedList
         * 2) When we have more number of Retrieve operation - Not prefer LinkedList
         * -  Internally uses a doubly linked list to store the elements. LinkedList is faster being node based as not much bit shifting required.
         */

        LinkedList l = new LinkedList();

        /** Add new elements to the Linkedlist  */

        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);

        System.out.println(l); //[100, welcome, 15.5, A, true]

        /** size()  */

        System.out.println("Number of elements in Linked list:" + l.size()); //5

        /** remove  */

        l.remove(1); // here 1 is index
    /** al.remove("welcome");  --> here welcome is element  */
        System.out.println("After removing element from Linked list:" + l); //[100, 15.5, A, true]

        /**
         * insert a new element
         * add(index, object)
         */

        l.add(2, "Python");
        System.out.println("After insertion:" + l); //[100, 15.5, Python, A, true]

        /** retrieve specific element  */

        System.out.println(l.get(2)); // Python, here 2 is index of element/object

        /** change element/replace  */

        l.set(2, "C#");
        System.out.println("After replacing element:" + l); //[100, 15.5, C#, A, true]

        /** search - contains() - Returns true / false  */

        System.out.println(l.contains("C#"));  //true
        System.out.println(l.contains("C++")); // false

        /** isEmpty()  */

        System.out.println(l.isEmpty()); //false

        /** 1) for loop  */

        System.out.println("Reading elements using for loop.......");

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }


        /** 2) for..each loop  */

        System.out.println("Reading elements using for..each loop");
        for (Object e : l) {
            System.out.println(e);
        }

        /** 3) iterator()  */

        System.out.println("Reading elements using iterator method");

        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); //printing the element and move to next
        }

    }

}
