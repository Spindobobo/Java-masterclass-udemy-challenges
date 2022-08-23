public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double firstVariable = (int) (a * 1000);
        double secondVariable = (int) (b * 1000);
        if (firstVariable == secondVariable) {
            return true;
        } else {
            return false;
        }
    }
}
