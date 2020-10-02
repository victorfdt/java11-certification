package nl.victorfdt.methodreferences;

import nl.victorfdt.utils.Exercise;

public class LearnMethodReferences implements Exercise {
    public void execute() {
        /*  There are four types of Reference Methods:
            Static methods,
         *
         * */

        // STATIC METHODs
        // My functional interface receives a parameter, but I don't need to specify it
        // because Java can assume that.
        LogElement log = System.out::println;
        log.log("Hello");



    }
}
