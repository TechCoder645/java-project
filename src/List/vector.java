package List;

public class vector {
    public static void main(String[] args) {
        // Create a Vector using the fully qualified name (java.util.Vector)
        // to avoid name collision with our own class named 'vector'.
        // By default, it initializes with an internal array capacity of 10.
        java.util.Vector<String> vector = new java.util.Vector<>();

        // capacity() returns the total allocated memory slots (not just current elements).
        // size() returns the actual number of elements currently stored in the vector.
        System.out.println("Initial Capacity: " + vector.capacity()); // Output: 10
        System.out.println("Initial Size: " + vector.size());         // Output: 0

        // add() appends elements to the end of the vector.
        // It is thread-safe (synchronized), meaning multiple threads can call this safely.
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Checking capacity vs size after adding items:
        System.out.println("Size after adding 3 items: " + vector.size());       // Output: 3
        System.out.println("Capacity remains: " + vector.capacity());          // Output: 10 (still 10 because capacity hasn't been exceeded yet)

        // trimToSize() trims the underlying array capacity to match the current size (3),
        // releasing unused memory slots to optimize resource usage.
        vector.trimToSize();
        System.out.println("Capacity after trimToSize(): " + vector.capacity()); // Output: 3
    }
}