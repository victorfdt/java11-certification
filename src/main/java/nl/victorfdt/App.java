package nl.victorfdt;

import nl.victorfdt.anonymouslocalclass.AnonymousClass;
import nl.victorfdt.enums.LearnEnums;
import nl.victorfdt.localclasses.MyClassWithLocalClass;
import nl.victorfdt.nestedclasses.AnotherBuilding;
import nl.victorfdt.nestedclasses.Building;
import nl.victorfdt.nestedstaticclasses.Boat;
import nl.victorfdt.nestedstaticclasses.MyBoatHelper;
import nl.victorfdt.utils.Exercise;

public class App {
    public static void main(String[] args) {
        // Learn Enums
        // Exercise exercise = new LearnEnums();

        // Learn Nested Classes
        // Exercise exercise = new Building();

        // Learn Static Nested Classes
        // Exercise exercise = new Boat();
        // Exercise exercise = new MyBoatHelper();

        // Learn local class
        // Exercise exercise = new MyClassWithLocalClass();

        // Learn Anonymous class
        Exercise exercise = new AnonymousClass();
        exercise.execute();
    }
}
