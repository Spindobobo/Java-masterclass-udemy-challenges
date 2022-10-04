public class Main {
    public static void main(String[] args) {
    boolean isPF = isPerfectNumber(28);
        System.out.println(isPF);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 0;
            for(int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return number == sum;
        }
    }
}