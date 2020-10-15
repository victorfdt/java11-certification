package nl.victorfdt.utils;

public interface Exercise {

    void execute();

    default void log(Object b){
        System.out.println(b);
    }
}
