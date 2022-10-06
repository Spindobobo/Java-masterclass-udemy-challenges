# Largest Prime

Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.


EXAMPLE INPUT/OUTPUT:

    getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21).
    getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217).
    getLargestPrime (0); should return -1 since 0 does not have any prime numbers.
    getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45).
    getLargestPrime (-1); should return -1 since the parameter is negative.

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

## Solution
```
public class Main {
    public static void main(String[] args) {
    int primeFactor = getLargestPrime(45);
        System.out.println(primeFactor);
    }
```
This is just code to test input/output.
```
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
```
Since 0 and 1 are not prime numbers, I worte an if statement to consider them invalid values.
```
        for(int i=2; i <= number; i++) {
            while ((number % i == 0) && (number != i)) {
                number /= i;
            }
        }
        return number;
    }
}
```
Then I created a for loop that initializes at 2 (because 1 isn't a prime number). 
Inside the for loop I created a while loop that runs checking if number is wholly divisible by i and, at the same time, isn't equal to i.
If so, the number should be divided by i. Finally, it should return the largest prime factor of a given number.
