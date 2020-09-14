package nl.victorfdt.reviewquestions.chapter1question11;

import nl.victorfdt.utils.Exercise;

public class Question11 {

    public interface CanWalk {
        default void walk() {
            System.out.print("Walking");
        }

        private void testWalk() {
        }
    }

    public interface CanRun {
        abstract public void run();

        private void testWalk() {
        }

        default void walk() {
            System.out.print("Running");
        }
    }

    public interface CanSprint extends CanWalk, CanRun {
        void sprint();

        // This method overloads, it does not overrides
        default void walk(int speed) {
            System.out.print("Sprinting");
        }

        // Now I'm choosing which implementation to use.
        default void walk() {
            CanRun.super.walk();
        }

        private void testWalk() {
        }
    }

    public class Test implements Exercise, CanSprint {
        public void execute(){
            this.walk();
        }

        @Override
        public void run() {

        }

        @Override
        public void sprint() {

        }

        public void walk() {
            CanSprint.super.walk();
        }
    }

}
