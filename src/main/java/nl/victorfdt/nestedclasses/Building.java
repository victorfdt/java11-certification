package nl.victorfdt.nestedclasses;

import nl.victorfdt.utils.Exercise;

public class Building implements Exercise {
    private String name;
    private static String address;

    public Building() {
        System.out.println("Building constructor");
        this.name = "Company inc.";
        this.address = "From Building: Somewhere 123";
    }

    private void callingMethods() {
        //Instantiate the Inner class and use its methods.
        BuildingHelper helper = this.new BuildingHelper();

        //It is not print the information from the constructor because it was not initialized
        helper.showInformation();
        this.new BuildingHelper().showInformation();

        //It will still not display it, because the helper was created using the older Building
        //class.
        Building b = new Building();
        System.out.println(b.name);
        helper.showInformation();

        Building bb = new Building();
        helper = bb.new BuildingHelper();
        helper.showInformation();
    }

    private void callingVariables() {
        // Inner classes can have variables with same name as the Outer class.
        // There is a special way to use this and access each variable.
        BuildingHelper helper = this.new BuildingHelper();

        //Access information from the Outer Class
        System.out.println(String.format("Building name: {}, address: {}", this.name, this.address));

        //Access information from the Inner Class
        System.out.println(String.format("BuildingHelper janitorName: {}, address: {}",
                this.new BuildingHelper().janitorName, helper.address));
    }

    public void execute() {
        callingMethods();
        callingVariables();
    }

    public class BuildingHelper {
        private String janitorName;
        private String address;
        // Inner classes are not allowed to have static variables, unless they are also final.
        // private static int height;

        private static final int height = 10;

        public BuildingHelper() {
            System.out.println("BuildingHelper constructor");
            this.janitorName = "Jorge";
            this.address = "From BuildingHelper: Somewhere 123";
        }

        public void cleanRooms() {
            System.out.println("The rooms were cleaned.");
        }

        public void showInformation() {
            System.out.println(String.format("Name: {}, Address: {}", name, Building.this.address));
        }
    }
}
