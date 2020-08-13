package nl.victorfdt;

import nl.victorfdt.enums.LearnEnums;
import nl.victorfdt.nestedclasses.Building;
import nl.victorfdt.utils.Exercise;

public class App {
    public static void main(String[] args) {
        //Learn Enums
        //Exercise exercise = new LearnEnums();

        // Learn Nested Classes
        Exercise exercise = new Building();
        exercise.execute();
    }
}
