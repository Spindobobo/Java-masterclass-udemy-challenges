# Speed Converter

**1.** Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

**2.** Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
Then it needs to print a message in the format "XX km/h = YY mi/h".
XX represents the original value kilometersPerHour. YY represents the rounded milesPerHour from the kilometersPerHour parameter.
If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

**TIP:** In the method printConversion, call the method toMilesPerHour instead of duplicating the code.

**NOTE:** All methods should be defined as public static like we have been doing so far in the course.

**NOTE:** 1 mile per hour is 1.609 kilometers per hour

**NOTE:** Do not add a main method to the solution code.


## Solution

**This problem demanded the formulation of an algorithm to convert miles per hour to kilometers per hour.**

```
public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609d);
    }

```

First I created the method toMilesPerHour as requested then added the if statement to indicate -1 if it the input was less than 0. Otherwise, I requested the method to return the rounded converted value of kilometers to miles using `Math.round`.

```
public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    "km/h = " + milesPerHour + "mi/h");
        }
    }
```

The second method was created in order to print the message "Invalid value" if the input was less than 0. Otherwise, it should convert kilometers to miles per hour and print a message using the variables `long milesPerHour` and `kilometersPerHour` in addition to "km/h" and "mi/h" texts.
