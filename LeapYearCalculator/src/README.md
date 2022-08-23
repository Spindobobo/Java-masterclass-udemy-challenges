# Leap Year Calculator

Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps: 
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.


The following are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600 (because they are evenly divisible by 100 but not by 400).


The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.

**NOTE:** The method isLeapYear needs to be defined as public static like we have been doing so far in the course.

**NOTE:** Do not add a  main method to solution code.

## Solution
```
public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
```
First I created a boolean method to return true or false, then I wrote a condition stating that if input year was less than 1 or greater than 9999 it should return false, as requested;
```
        } else if ((year % 4 ==0) &&
                (year % 100 == 0) &&
                (year % 400 == 0)) {
            return true;
```
After that, I declared that if the year was evenly divisible by 4, 100 and 400 it should return true;
```
        } else if ((year % 4 == 0) && (year % 100 != 0) ||
                (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        }
        return false;
        }
```
Finally, I stated that if a year was evenly divisible by 4 but not by a 100 or by a 100 and by 400 it was still a leap year. Otherwise, it should return false.
