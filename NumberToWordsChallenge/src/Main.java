public class Main {
    public static void main(String[] args) {
        numberToWords(10);
        System.out.println(reverse(100));
        int digit = getDigitCount(0);
        System.out.println(digit);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversed = reverse(number);
        int digitCount = getDigitCount(number);
        int count = 0;
        while (count < digitCount) {
            count++;
            int lastDigit = reversed % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0)
            return 1;

        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}