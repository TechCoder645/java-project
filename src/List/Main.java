package List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // list or collection -> interface
        // ArrayList -> concrete class      3 ways of creating a list in java
        ArrayList<Integer> list = new ArrayList<>();

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
        List<Integer> list2 = new ArrayList<>();
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

        // Collection<Integer> collection = new ArrayList<>();

        // traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("element " + iterator.next());
        } // <-- Added missing closing brace here to end the while loop!

        List<Integer> list3 = new ArrayList<>();
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
        System.out.println(list3.contains(100)); // for check 100 present in list

        list.add(12);
        list.add(3);
        list.add(18);
        System.out.println("Printing Entire List: " + list);
        
        // sort an arrayList
// Collection<Integer> collection = new ArrayList<>();
        Collections.sort(list);
        System.out.println("Printing Entire List: " + list);

        ArrayList<Integer> newList= (ArrayList<Integer>)list.clone();
        System.out.println("printing newList: " +newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(newList.isEmpty());
        System.out.println(newList.indexOf(40));

    }
}