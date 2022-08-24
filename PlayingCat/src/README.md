# Playing Cat

The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false

1st parameter should be of type boolean and be named summer it represents if it is summer.

2nd parameter represents the temperature and is of type int with the name temperature.

**NOTES**

    The isCatPlaying method needs to be defined as public static like we have been doing so far in the course.

    Do not add the main method to the solution code.
    
## Solution
```
public static boolean isCatPlaying(boolean summer,int temperature) {
        if ((summer) && (temperature >= 25) && (temperature <= 45)) {
            return true;
```
First I used the parameters to write an if statement and return true if it was summer and temperature range was within 25 and 45.
```
        } else if ((!summer) && (temperature >= 25) && (temperature <= 35)) {
            return true;
```
After that I wrote another condition stating that even if it wasn't summer, but temperature range was within 25 and 35 it should return true.
```
        } else {
            return false;
        }
    }
```
Finally, I declared that everything else should return false (since the cat wouldn't be playing).
