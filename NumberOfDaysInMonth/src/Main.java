public class Main {

    public static void main(String[] args) {
        boolean x = isLeapYear(2020);
        System.out.println(x);
        int y = getDaysInMonth(2, 2020);
        System.out.println(y);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return (year % 400 == 0);
                } else return true;
            } else return false;
        } return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        if ((isLeapYear(year)) && (month == 2)) {
            return 29;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;

        } return -1;
    }
}