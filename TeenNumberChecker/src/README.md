# Teen Number Checker

We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

## Solution
```
public static boolean hasTeen(int a,int b,int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) {
            return true;
        } else if (c >= 13 && c <= 19) {
            return true;
        } else {
            return false;
        }
    }
```

First I wrote if statements to check if one of the parameters (`int a`, `int b` or `int c`) would be into the range of 13 -19. Otherwise it should return false.
```
public static boolean isTeen(int d) {
        if (d >= 13 && d <= 19) {
            return true;
        } else {
            return false;
        }
    }
```
After that I created another method to check if an specific number (`int d`) was a teen number. Otherwise it should return false.
