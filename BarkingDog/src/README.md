# Barking Dog

We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
In all other cases return false.
If the hourOfDay parameter is less than 0 or greater than 23 return false.

**TIP:** Use the if else statement with multiple conditions.

**NOTE:** The shouldWakeUp method  needs to be defined as public static like we have been doing so far in the course.

**NOTE:** Do not add a  main method to solution code.


## Solution
```
public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else if (barking && hourOfDay == 23) {
            return true;
        } else {
            return false;
        }
    }
```
First I created a boolean method in order to return true or false statements, then an if statement to wake up if the condition barking was true while it was equal to or greater than 0h and less than 8h.
Additionally, I wrote another if statement to wake up if the dog was barking and it was 23h specifically. Finally, all other conditions were supposed to return false.
