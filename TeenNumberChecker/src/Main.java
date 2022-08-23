public class Main {
    public static void main(String[] args) {
        boolean numberChecker = TeenNumberChecker.hasTeen(22,23,24);
        System.out.println(numberChecker);

        boolean teenNumber = TeenNumberChecker.isTeen(13);
        System.out.println(teenNumber);
    }
}