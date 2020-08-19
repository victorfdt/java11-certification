package nl.victorfdt.nestedstaticclasses;

import nl.victorfdt.nestedstaticclasses.Boat.BoatHelper;
import nl.victorfdt.utils.Exercise;

public class MyBoatHelper implements Exercise {

    public void execute() {
        // Instantiate the inner class from Boat.
        BoatHelper boatHelper = new BoatHelper();
        boatHelper.execute();
    }
}
