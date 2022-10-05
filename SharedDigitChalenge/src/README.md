Shared Digit

Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
```
EXAMPLE INPUT/OUTPUT:
    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers.
    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99.
    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers.
```
NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

## Solution
```
public class Main {
    public static void main(String[] args) {
        boolean sharedDigit = hasSharedDigit(9,100);
        System.out.println(sharedDigit);
    }
```
This was just code to test input/output.
```
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }
```
The algorythm should check if parameters given are within 10 and 99. Otherwise it should return false, since it is an invalid value.
```
        for (int i = a;  i > 0; i /= 10){
            for(int j = b; j > 0; j /= 10){
                int digit1 = i % 10;
                int digit2 = j % 10;
                if(digit1 == digit2){
                    return true;
                }
            }
        }return false;
    }
}
```
Then I created a for loop to get input numbers, divide them by 10 and get the remainder digits. 
Afterwards, it should check if there is a shared digit between `int a` and `int b`. If so, it should return true. If not, then false.
