package nl.victorfdt;

import nl.victorfdt.collectionInterfaces.LearnCollectionInterfaces;

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
        //Exercise exercise = new AnonymousClass();

        // Chapter 1 Question 11
        //Question11.Test exercise = new Question11().new Test();

        // Chapter 1 Question 17
        // Exercise exercise = new Hyena();

        //LearnMethodReferences exercise = new LearnMethodReferences();
        var exercise = new LearnCollectionInterfaces();
        exercise.execute();
    }
}
