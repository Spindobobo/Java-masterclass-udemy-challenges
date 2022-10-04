public class Main {
    public static void main(String[] args) {
    boolean lastDigit = hasSameLastDigit(9,99,19);
        System.out.println(lastDigit);
    boolean validNumber = isValid(9);
        System.out.println(validNumber);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) && !isValid(b) && !isValid(c))  {
            return false;
        }

        while (isValid(a) && isValid(b) && isValid(c)) {
            a %= 10;
            b %= 10;
            c %= 10;
            if ((a==b) || (a==c) || (b==c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int x) {
        return ((x >= 10) && (x <= 1000));
    }
}