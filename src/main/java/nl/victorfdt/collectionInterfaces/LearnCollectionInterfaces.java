package nl.victorfdt.collectionInterfaces;

import nl.victorfdt.utils.Exercise;

import java.util.*;
import java.util.function.BiFunction;

public class LearnCollectionInterfaces implements Exercise {

    public void execute() {
        mapInterface();
    }

    public void queueInterface() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        log("Elements of the queue");
        log(queue);

        log("Queue element");
        log(queue.element());

        log("offer() add the element at the back of the queue");
        queue.offer(10);
        log(queue);

        log("Remove an element from the queue");
        queue.remove(10);
        log(queue);
    }

    public void setInterface() {
        //Using the Set interface
        //HashSet
        Set<Integer> integerSet = new HashSet<Integer>(Set.of(1, 6, 8, 3, 9, 5, 2, 7, 4));
        System.out.println(integerSet);

        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(6);
        integerSet1.add(8);
        integerSet1.add(3);
        integerSet1.add(9);
        integerSet1.add(5);
        integerSet1.add(2);
        integerSet1.add(7);
        integerSet1.add(4);

        System.out.println(integerSet1);
    }

    public void listInterface() {
        //Using a List factory
        List<String> l1 = Arrays.asList(new String[]{"1", "2"});
        List<String> l2 = List.of("1", "2");
        List<String> l3 = List.copyOf(l2);
    }

    public void mapInterface() {
        //Creating a Map
        //It is not possible to modify the map.
        Map<Integer, String> studentsBase = Map.ofEntries(
                Map.entry(1, "Victor"),
                Map.entry(2, "Ricardo")
        );

        Map<Integer, String> students = new HashMap<>();

        //Adding information
        students.put(1, "Victor");
        students.put(2, "Leonardo");

        log(students);

        //Creating a mapping function
        BiFunction<String, String, String> mapper = (String v1, String v2) -> {
            return v1.length() > v2.length() ? v1 : v2;
        };

        log(students.merge(1, "ArnaldoSantos", mapper));
        log(students);
    }
}
