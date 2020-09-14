package nl.victorfdt.annotations;

public @interface ZooAnimal {
    // required element
    String food();

    // optional element - default value
    int sleepTime() default 6;

    // constant field
    public static final String TYPE = "animal";

    // it is also a constant field
    String planet = "earth";
}
