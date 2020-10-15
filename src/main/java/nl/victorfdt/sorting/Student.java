package nl.victorfdt.sorting;

public class Student implements Comparable<Student> {

    private String name;

    public Student() {
    }

    public Student(String theName) {
        name = theName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Student theStudent) {
        return name.compareTo(theStudent.name);
    }
}
