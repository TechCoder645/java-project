package List;
import java.util.Stack;
public class stack {
        public static void main(String[] args) {
            /*
             * WHAT IS A STACK?
             * - A Stack is a LIFO (Last-In, First-Out) data structure.
             * - It extends Vector in Java, meaning it is synchronized (thread-safe),
             *   though like Vector, it is considered a legacy class.
             * - Think of it like a stack of plates: the last plate you put on top
             *   is the first one you take off.
             */

            // 1. Creating a Stack
            Stack<String> stack = new Stack<>();

            // 2. empty() - Tests if the stack is currently empty
            System.out.println("Is stack empty? " + stack.empty()); // Output: true

            // 3. push(item) - Pushes (adds) an item onto the top of the stack
            stack.push("First Plate");
            stack.push("Second Plate");
            stack.push("Top Plate");
            System.out.println("Stack after pushes: " + stack); // Output: [First Plate, Second Plate, Top Plate]

            // 4. peek() - Looks at the object at the top of the stack WITHOUT removing it
            System.out.println("Peek at top element: " + stack.peek()); // Output: Top Plate

            // 5. search(element) - Returns the 1-based position from the top of the stack where the object is located
            // Returns -1 if the element is not found.
            System.out.println("Position of 'First Plate' from top: " + stack.search("First Plate")); // Output: 3

            // 6. pop() - Removes and returns the object at the top of the stack
            String removedItem = stack.pop();
            System.out.println("Popped element: " + removedItem); // Output: Top Plate
            System.out.println("Stack after pop(): " + stack);     // Output: [First Plate, Second Plate]

            // Checking if empty again
            System.out.println("Is stack empty now? " + stack.empty()); // Output: false
        }
    }

