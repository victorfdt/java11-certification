package nl.victorfdt;

import nl.victorfdt.enums.LearnEnums;
import nl.victorfdt.utils.Exercise;

public class App {
    public static void main(String[] args) {
        Exercise exercise = new LearnEnums();
        exercise.execute();
    }
}
