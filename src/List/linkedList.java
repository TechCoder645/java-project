package List;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class linkedList {

    public static void main(String[] args) {
        // LinkedList declaration using List interface (best practice)
        List<Integer> list = new LinkedList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // addAll
        List<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(50);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("printing list 2: " + list2);
        list2.clear();
        System.out.println(list2.size());

        // traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("element " + iterator.next());
        }

        List<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println(list3.get(0));
        System.out.println("before set: " + list3);
        list3.set(0, 100);
        System.out.println("after set: " + list3);

        // toArray
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contains
        System.out.println(list3.contains(100)); // check if 100 is present

        list.add(12);
        list.add(3);
        list.add(18);
        System.out.println("Printing Entire List: " + list);

        // Sort the list using Collections.sort()
        Collections.sort(list);
        System.out.println("Printing Entire List (Sorted): " + list);

        // Note: LinkedList does not have a public .clone() method like ArrayList.
        // Instead, you can use the copy constructor:
        LinkedList<Integer> newList = new LinkedList<>((LinkedList<Integer>) list);
        System.out.println("printing newList: " + newList);

        // Note: ensureCapacity() is specific to ArrayList and Vector (for underlying arrays),
        // so it is not available on LinkedList.
        System.out.println(newList.isEmpty());
        System.out.println(newList.indexOf(40));

        //addFirst and addLast
        // Since 'list' is declared as the List interface, we cast it to LinkedList
        // to use addFirst() and addLast() without changing your variable declaration or comments:
        LinkedList<Integer> ll = (LinkedList<Integer>) list;

        // addFirst() adds the specified element at the beginning
        ll.addFirst(5);
        System.out.println("After addFirst(5): " + list);

        // addLast() adds the specified element at the end of
        ll.addLast(99);
        System.out.println("After addLast(99): " + list);

        // getFirst() returns the first element
        System.out.println("getFirst(): " + ll.getFirst());

        // getLast() returns the last element
        System.out.println("getLast(): " + ll.getLast());

        // removeFirst() removes the first element
        ll.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // removeLast() removes the last element
        ll.removeLast();
        System.out.println("After removeLast(): " + list);

        // peek() returns the first element (head) of the link
        System.out.println("peek(): " + ll.peek());

        // poll() returns and removes the first element fro
        System.out.println("poll(): " + ll.poll());
        System.out.println("After poll(): " + list);

        // offer() adds the specified element at the end of
        ll.offer(88);
        System.out.println("offer(88): " + list);
    }
}