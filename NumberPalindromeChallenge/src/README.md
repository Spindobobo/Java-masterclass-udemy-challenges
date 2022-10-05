# Number Palindrome

Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean. 
It should return true if the number is a palindrome number otherwise it should return false. Check the tips below for more info about palindromes.
```
Example Input/Output
    isPalindrome(-1221); → should return true
    isPalindrome(707); → should return true
    isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
```
What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number: find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse. 
If both are the the same then the number is a palindrome otherwise it is not.

Tip: Logic to reverse a number: declare and initialize another variable to store the reverse of a number, for example reverse = 0. 

Extract the last digit of the given number by performing the modulo division (remainder). 
Store the last digit to some variable say lastDigit = num % 10. 
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse. 
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10. 
Repeat steps until number is not equal to (or greater than) zero. 
A while loop would be good for this coding exercise.


Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).

NOTE: The method isPalindrome needs to be defined as public static like we have been doing

## Solution
```
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1441));
    }
```
This was just an input/output test.
```
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int stored = number;
        while (stored != 0) {
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored /= 10;
        }
        if (number == reverse) {
            return true;
        } else return false;
    }
}
```
I created an algorythm to check if a number is a palindrome. First I initialized `int reverse` to store the reversed number. Then I initialized `int stored = number` so I could use and update input in the while loop.
After that I wrote the for loop with `int lastDigit` to analyze the last number, `reverse = (reverse * 10) + lastDigit` to update the reverse variable and `stored /= 10` to update the stored variable.
Finally, I checked if number was equal to reversed number using an if condition.
