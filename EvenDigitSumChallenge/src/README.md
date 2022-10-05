# Even Digit Sum

Write a method named getEvenDigitSum with one parameter of type int called number. 
The method should return the sum of the even digits within the number. 
If the number is negative, the method should return -1 to indicate an invalid value.
```
EXAMPLE INPUT/OUTPUT:
    getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20.
    getEvenDigitSum(252); → should return 4 since 2 + 2 = 4.
    getEvenDigitSum(-22); → should return -1 since the number is negative.
```
NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

## Solution
```
public class Main {
    public static void main(String[] args) {
    int sum = getEvenDigitSum(123456789);
        System.out.println(sum);
    }
```
This was just a way to test input/output.
```
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
```
If the number is negative, it should return -1 since it is an invalid value.
```
        int sum = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
```
I initialized `int sum` to store the sum value. Then I created a while loop to check if a digit is even `if (number % 2 == 0)`. 
If so, it should update the sum variable. Afterwards, it executes `number /= 10;` to jump to the next digit and then checks again if it is an even digit.
Finally, when it's done, it returns the sum of the even digits.
