public class Main {
    public static void main(String[] args) {

        getDurationString(1440,0);
        getDurationString(86400);
    }

    public static int getDurationString(int minutes,int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid value.");
            return -1;
        }

        int hours = (minutes / 60);
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " minutes " + seconds + " seconds = " +
                hours + "h " + remainingMinutes + "m " + seconds + "s." );
        return hours;
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value.");
            return -1;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "s = " + minutes + "m " + remainingSeconds + "s.");
        return getDurationString(minutes,remainingSeconds);
    }
}

