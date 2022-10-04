public class Main {
    public static void main(String[] args) {
    int primeFactor = getLargestPrime(45);
        System.out.println(primeFactor);
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        for(int i=2; i <= number; i++) {
            while ((number % i == 0) && (number != i)) {
                number /= i;
            }
        }
        return number;
    }
}

