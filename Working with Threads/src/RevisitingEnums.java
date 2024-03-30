public class RevisitingEnums {
    public static void main(String[] args) {
        System.out.println("Revisiting Enums and their functionality");

        Days monday = Days.MONDAY;
        Days saturday = Days.SATURDAY;

        // Checking for weekdays / weekends on both the days
        Days.isWeekDay(monday);
        Days.isWeekEnd(saturday);
    }
}
