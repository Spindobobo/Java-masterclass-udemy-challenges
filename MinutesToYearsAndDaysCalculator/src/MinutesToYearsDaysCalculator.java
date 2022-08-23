public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long hour = minutes / 60;
        long remainingHours = hour % 24;
        long day = hour / 24;
        long remainingDays = day % 365;
        long year = day / 365;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
