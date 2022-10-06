# Input Calculator

Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

EXAMPLES OF INPUT/OUTPUT:

EXAMPLE 1:

INPUT:

    1
    2
    3
    4
    5
    a

OUTPUT
```
SUM = 15 AVG = 3
```
EXAMPLE 2:

INPUT:
```
hello
```
OUTPUT:
```
SUM = 0 AVG = 0
```

TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

NOTE: Be mindful of spaces in the printed message.

NOTE: Be mindful of users who may type an invalid input right away (see example above).

NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far in the course.

NOTE: Do not add the main method to the solution code.

## Solution
```
import java.util.Scanner;
```
Here I imported the scanner so I could use it in the code.
```
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 0;
```
Then I created the scanner and initialized variables to store the value of the sum (`int sum`), the average (`long average`) and how many numbers have been input (`int counter`) to calculate average.
```
        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
```
This while loop was designed to begin the input calculator. After the "Enter number" message, users write input and `boolean isAnInt` checks if input is an int.
```
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average = Math.round((double) sum / (double) counter);
            } else {
                break;
            }
 ```
 If so, then the scanner saves the value and updates counter, sum and average variables. The scanner pauses if something that isn't an int is introduced.
 ```
            scanner.nextLine();
        }
 ```
 This is code written to deal with pressing enter and avoid ending the calculator.
 ```
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
```
Finally, in case something that isn't an int is input, then it prints the sum and average of the numbers and shuts down.
