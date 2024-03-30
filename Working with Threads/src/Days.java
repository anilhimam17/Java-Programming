public enum Days {

    // An Enum takes a set of constants to being with, the order of the constants is followed when used
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Following the definitions of the constants Enums take Helper functions
    public static void isWeekDay(Days day) {
        if (day != SATURDAY && day != SUNDAY) {
            System.out.println("The given day: " + day + " is a weekday");
        }
    }

    public static void isWeekEnd(Days day) {
        if (day == SATURDAY || day == SUNDAY) {
            System.out.println("The given day: " + day + " is a weekend");
        }
    }
}
