package nl.victorfdt.annotations;

import nl.victorfdt.utils.Exercise;

public class LearnAnnotations implements Exercise {

    @Music(genres = {"Rock"})
    private String music1;

    @Music(genres = "Pop")
    private String music2;

    @Music(genres = {"Jazz", "Reggae"})
    private String music3;

    public void execute() {
        Lion lion = new Lion();

        // It is possible to use annotation without providing the element name, but definign only one element called 'value'
        @Home("value")
        String home;
    }
}
