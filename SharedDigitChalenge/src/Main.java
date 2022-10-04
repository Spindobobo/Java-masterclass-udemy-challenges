public class Main {
    public static void main(String[] args) {
        boolean sharedDigit = hasSharedDigit(9,100);
        System.out.println(sharedDigit);
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        for (int i = a;  i > 0; i /= 10){
            for(int j = b; j > 0; j /= 10){
                int digit1 = i % 10;
                int digit2 = j % 10;
                if(digit1 == digit2){
                    return true;
                }
            }
        }return false;
    }
}