package nl.victorfdt.utils;

public interface Exercise {

    void execute();

    default void log(Object object){
        System.out.println(object.toString());
    }
}
