package List;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

    public class VectorWithDifferences {
        public static void main(String[] args) {

            /*
             * =========================================================================
             * KEY DIFFERENCE 1: THREAD SAFETY & SYNCHRONIZATION
             * - Vector: Synchronized (thread-safe). Every method is locked, meaning only
             *   one thread can access it at a time. This prevents data corruption in
             *   multi-threaded apps, but causes a performance penalty.
             * - ArrayList: NOT synchronized (not thread-safe). It lacks locking overhead,
             *   making it much faster in single-threaded applications.
             * =========================================================================
             */
            Vector<Integer> vector = new Vector<>();
            ArrayList<Integer> arrayList = new ArrayList<>(); // Comparison reference

            /*
             * =========================================================================
             * KEY DIFFERENCE 2: CAPACITY GROWTH & RESIZING
             * - Vector: When full, it usually doubles its capacity (100% growth).
             * - ArrayList: When full, it increases its capacity by 50%.
             * =========================================================================
             */

            // capacity() = total memory slots allocated. size() = actual elements stored.
            System.out.println("Vector Default Initial Capacity: " + vector.capacity()); // Default is 10
            System.out.println("Initial Size: " + vector.size()); // 0

            // add() - Appends an element to the end of the vector (Synchronized)
            vector.add(10);
            vector.add(20);
            vector.add(30);

            // addElement() - Legacy method (identical to add())
            vector.addElement(40);

            // add(index, element) - Inserts element at specific index and shifts others right
            vector.add(1, 15); // Result: [10, 15, 20, 30, 40]

            // get(index) - Returns the element at the specified index
            System.out.println("Element at index 2: " + vector.get(2)); // 20

            // set(index, element) - Replaces the element at the index with a new value
            vector.set(0, 5); // Result: [5, 15, 20, 30, 40]

            // remove(index) - Removes the element at the specified index
            vector.remove(3); // Removes 30

            // contains(element) - Returns true if element exists in the vector
            System.out.println("Does vector contain 15? " + vector.contains(15)); // true

            // indexOf(element) - Returns the index of the first occurrence of the element
            System.out.println("Index of 20: " + vector.indexOf(20)); // 2

            // firstElement() & lastElement() - Legacy methods to get first/last items
            System.out.println("First element: " + vector.firstElement()); // 5
            System.out.println("Last element: " + vector.lastElement());   // 40

            // trimToSize() - Shrinks the underlying capacity to match the current size (saves memory)
            vector.trimToSize();
            System.out.println("Capacity after trimToSize(): " + vector.capacity());

            /*
             * =========================================================================
             * KEY DIFFERENCE 3: ORIGIN & LEGACY
             * - Vector: A legacy class introduced in Java 1.0 (before the Collections Framework).
             * - ArrayList: Introduced in Java 1.2 as part of the modern Collections Framework.
             * =========================================================================
             */

            // Iterator - Used to traverse through the vector elements sequentially
            Iterator<Integer> iterator = vector.iterator();
            while (iterator.hasNext()) {
                System.out.println("Iterating item: " + iterator.next());
            }

            // Collections.sort() - Sorts the vector in ascending order
            Collections.sort(vector);
            System.out.println("Sorted Vector: " + vector);

            // clear() - Removes all elements from the vector
            vector.clear();
            System.out.println("Is vector empty after clear? " + vector.isEmpty()); // true
        }
    }

