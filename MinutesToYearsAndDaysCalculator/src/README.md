# Minutes To Years and Days Calculator

Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.

YY represents the calculated years.

ZZ represents the calculated days.

**TIPS:**

    Be extra careful about spaces in the printed message.

    Use the remainder operator

    1 hour = 60 minutes

    1 day = 24 hours

    1 year = 365 days

**NOTES**

    The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.

    Do not add main method to solution code.

    The solution will not be accepted if there are extra spaces
    
## Solution
**This method focused on converting minutes to years and days**
```
 public static void printYearsAndDays(long minutes) {
        long hour = minutes / 60;
        long remainingHours = hour % 24;
        long day = hour / 24;
        long remainingDays = day % 365;
        long year = day / 365;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
```
First I stored the value of an hour using the variable `long hour` and assigning its value to parameter `long minutes` divided by 60.
After that I did something similar to variables `long day`, `long remainingDays` and `long year`.
Finally I wrote an if statement to print the message "Invalid Value" if minutes input was less than 0. Otherwise it should convert minutes into years and remaining days.

**P.S: I didn't use `remainingHours` variable, but I already had created it so I decided to leave it just in case.**
