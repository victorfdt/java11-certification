package nl.victorfdt.sorting;

import nl.victorfdt.utils.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LearnSorting implements Exercise {


    // Inner class
    Comparator<Student> studentComparator = new Comparator<Student>() {
        public int compare(Student s1, Student s2){
            return s1.getName().compareTo(s1.getName());
        }
    };

    // Lambda
    Comparator<Student> studentComparator2 = (s1,s2) -> {return s1.getName().compareTo(s2.getName());};

    // Method Reference
    Comparator<Student> studentComparator3 = Comparator.comparing(Student::getName);


    public void execute() {
        //Using Comparable

        List<Student> studentList = List.of(new Student("Victor"), new Student("Leonardo"));
        var list = new ArrayList<Student>();
        list.add(new Student("Victor"));
        list.add(new Student("Leonardo"));

        log("before sorting");
        log(list);
        log("after sorting");
        Collections.sort(list);
        log(list);


    }
}
