# Area Calculator

Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

**TIP:** The formula for calculating the area of a rectangle is x * y.

**TIP:** The formula for calculating a circle area is radius * radius * PI.

**TIP:** For PI use a constant from Math class e.g. Math.PI

**NOTE:** All methods need to be defined as public static like we have been doing so far in the course.

**NOTE:** Do not add a main method to your solution code!

## Solution
```
public static double area(double radius) {
        double circleArea = radius * radius * Math.PI;

        if (radius < 0) {
            return -1;
        } else {
            return circleArea;
        }
    }
```
First I initialized the variable `double circleArea` inside the method to calculate the area of a circle, then wrote an if statement to return -1 if radius was less than 0. Otherwise, it should return the value of a circle area.
```
public static double area(double x,double y) {
        double rectangleArea = x * y;

        if ((x < 0) || (y < 0)) {
            return -1;
        } else {
            return rectangleArea;
        }
    }
```
After that I overloaded the method to have the same function (calculating the area of something), but with two parameters `double x` and `double y` and initialized the variable `double rectangleArea` to calculate the area of a rectangle.
Finally I wrote an if statement to return -1 if either or both parameters were less than 0. Otherwise it should return the value of a rectangle area.
