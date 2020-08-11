package nl.victorfdt.enums;

import static java.lang.System.out;

import nl.victorfdt.utils.Exercise;

public class LearnEnums implements Exercise {

    public void execute() {
        // Show all content of the Enum
        for (DaysOfWeek day : DaysOfWeek.values()) {
            out.printf("Day of week: %s%n", day.name());
        }

        // Get an enum value and place it in a variable
        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;

        // Compare the value of an Enum
        out.println(daysOfWeek.equals(DaysOfWeek.MONDAY));
        out.println(daysOfWeek == DaysOfWeek.MONDAY);

        // Display de name of the Enum
        out.println(daysOfWeek.name());

        // Create an Enum from the value
        DaysOfWeek tuesday = DaysOfWeek.valueOf("TUESDAY");

        // Display the ordinal position
        out.println(tuesday.ordinal());

        // Handle the exception when it is not possible to create the Enum
        DaysOfWeek friday = DaysOfWeek.FRIDAY;
        try {
            friday = DaysOfWeek.valueOf("friday");
        } catch (IllegalArgumentException e) {
            out.println("Illegal argument");
        }

        // Using Enum with Switch. It is not allowed to provide the Enum name
        switch (friday) {
            case MONDAY:
                out.println("MONDAY");
                break;
            case FRIDAY:
                out.println("FRIDAY");
                break;
            default:
                out.println("Not a day of the week");
        }

        // Using enums with constructor, methods and fields
        // It will call the constructor only once, and it will initialize all values.
        Seasons summer = Seasons.SUMMER;

        // The constructor is not called anymore.
        Seasons winter = Seasons.WINTER;

        out.println(winter);
    }
}
