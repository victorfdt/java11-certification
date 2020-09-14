package nl.victorfdt.nestedstaticclasses;

import nl.victorfdt.utils.Exercise;

public class Boat implements Exercise {
    private String name;
    private static int length;

    public Boat() {
        System.out.println("Calling Boat constructor");
        this.name = "Symphony of the Seas";
        this.length = 10;
    }

    public static void staticMethod() {
        System.out.println("Boat.staticMethod");
    }

    public void nonStaticMethod() {
        System.out.println("Boat.nonStaticMethod");
    }

    public void execute() {
        // Instantiating the inner class. Since it is a static inner class,
        // it is not necessary to use and instance of the outer class.
        BoatHelper helper = new BoatHelper();
        helper.execute();

    }

    public static class BoatHelper implements Exercise {

        private static int length;
        public void nonStaticMethod() {
            System.out.println("BoatHelper.nonStaticMethod");
        }

        public static void staticMethod() {
            System.out.println("BoatHelper.staticMethod");
        }

        public void execute() {
            System.out.println("Execute method inside BoatHelper");
            // Trying to access methods/fields from the outer class.

            // I can only access static
            System.out.println("Boat.length = " + length);
            staticMethod();

            // ERROR:  It is not an static field
            // System.out.println("Boat.name = " + name);

            System.out.println(Boat.length);

            // ERROR: It is not an static method
            // nonStaticMethod();

            // Calling methods from the outer class
            Boat.staticMethod();
            Boat boat = new Boat();
            boat.name = "boat";
        }
    }
}
