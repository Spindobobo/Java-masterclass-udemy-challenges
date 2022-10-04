public class Main {
    public static void main(String[] args) {
        int sum = sumFirstAndLastDigit(-10);
        System.out.println(sum);
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number >= 10) {
           number /= 10;
        }
        return lastDigit + number;
    }
}

