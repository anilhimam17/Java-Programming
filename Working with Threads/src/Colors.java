public enum Colors {

    // List of color constants accepted by the enum
    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK("\u001B[37m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_RED("\u001B[31m"),
    ANSI_YELLOW("\u001B[33m");

    // Adding an Instance field to the Enum to store colors
    private final String color;

    // Constructor of the Enum
    Colors(String color) {
        this.color = color;
    }

    // Access method for the colors used in the enum
    public String color() {
        return color;
    }
}
