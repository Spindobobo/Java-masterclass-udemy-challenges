public class Main {
    public static void main(String[] args) {
    boolean flourPack = canPack(2,2,11);
        System.out.println(flourPack);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        while ((bigCount > 0) && (goal >= 5)) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }
}