public class AreaCalculator {

    public static double area(double radius) {
        double circleArea = radius * radius * Math.PI;

        if (radius < 0) {
            return -1;
        } else {
            return circleArea;
        }
    }

    public static double area(double x,double y) {
        double rectangleArea = x * y;

        if ((x < 0) || (y < 0)) {
            return -1;
        } else {
            return rectangleArea;
        }
    }
}
