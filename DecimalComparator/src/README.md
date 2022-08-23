# DecimalComparator

Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

**TIP:** Use paper and pencil.

**TIP:** Use casting.

**NOTE:** The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.

**NOTE:** Do not add a  main method to solution code.

## Solution
```
public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double firstVariable = (int) (a * 1000);
        double secondVariable = (int) (b * 1000);
        if (firstVariable == secondVariable) {
            return true;
        } else {
            return false;
        }
    }
```
First I created `double firstVariable` and `double secondVariable` and used typecasting to convert `double a` and `double b` into integers multiplied by a 1000 (so it would consider three decimal places).
After that I wrote an if condition that should return true if numbers a and b were the same up to three decimal places. Otherwise it should return false.
