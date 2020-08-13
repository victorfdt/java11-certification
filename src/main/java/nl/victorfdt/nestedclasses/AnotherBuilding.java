package nl.victorfdt.nestedclasses;

import nl.victorfdt.utils.Exercise;

public class AnotherBuilding implements Exercise {

    public void execute(){
        // Trying to access the Inner class of the Building class.
        // Since the Inner class is public, I can access it.
        Building building = new Building();
        Building.BuildingHelper helper = building.new BuildingHelper();

        helper.showInformation();
    }
}
