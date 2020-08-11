package nl.victorfdt.enums;

public enum Seasons {
    SUMMER("summer") {
        public String getFeeling() {
            return "Hot";
        }

        public String getMood() {
            return "It is great!";
        }
    }, FALL("fall") {
        public String getFeeling() {
            return "Chill";
        }
    }, WINTER("winter") {
        public String getFeeling() {
            return "Cold";
        }

        public String getMood() {
            return "It is very cold!";
        }
    }, SPRING("spring") {
        public String getFeeling() {
            return "Chill";
        }
    };
    private String name;

    /**
     * All constructors from Enum as considered private. I don't need to place the modifier.
     * The constructor is called only once at the first time the Enum is initialized.
     *
     * @param name
     */
    Seasons(String name) {
        System.out.println("Called constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * All enum values must implement this method.
     *
     * @return the feeling of the season.
     */
    public abstract String getFeeling();

    /**
     * The implementation of this method is optinal.
     *
     * @return the mood fo the season.
     */
    public String getMood() {
        return "Neutral";
    }
}
