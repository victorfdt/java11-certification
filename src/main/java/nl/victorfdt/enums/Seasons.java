package nl.victorfdt.enums;

public enum Seasons {
    SUMMER("summer") {
        public String getFeeling() {
            return "Hot";
        }

        @Override
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

    public abstract String getFeeling();

    public String getMood() {
        return "Neutral";
    }
}
