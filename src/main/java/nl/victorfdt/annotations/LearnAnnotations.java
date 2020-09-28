package nl.victorfdt.annotations;

import java.lang.annotation.Documented;

import nl.victorfdt.utils.Exercise;

public class LearnAnnotations implements Exercise {


    @Music(genres = {"Rock"})
    private String music1;

    @Music(genres = "Pop")
    private String music2;

    @Music(genres = {"Jazz", "Reggae"})
    private String music3;

    /**
     * Method that executes the class.
     * */
    public void execute() {
        Lion lion = new Lion();

        // It is possible to use annotation without providing the element name, but definign only one element called 'value'
        @Home("value")
        String home;
    }
}
