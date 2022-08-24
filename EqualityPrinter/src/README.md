# Equality Printer

Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".

**TIP: Be extremely careful about spaces in the printed message.** 


**NOTES**

    The solution will not be accepted if there are extra spaces.

    The method printEqual needs to be defined as public static like we have been doing so far in the course.

    Do not add main method to solution code.
    
## Solution
```
public static void printEqual(int a,int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println("Invalid Value");
```
Since all the variables (`int a`, `int b` and `int c`) were created as parameters I just wrote an if statement to print "Invalid Value" if any of them were less than 0.
```
        } else if ((a == b) && (a == c) && (b == c)) {
            System.out.println("All numbers are equal");
```
Then I wrote another condition to check if all of them were equal and print the respective message.
```
        } else if ((a != b) && (a != c) && (b != c)) {
            System.out.println("All numbers are different");
```
After that I created another condition to check if all of them were different and print the respective message.
```
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
```
Finally, I requested to print the message "Neither all are equal or different" in case any of the above conditions weren't true.
