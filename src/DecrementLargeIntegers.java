import java.util.Arrays;

public class DecrementLargeIntegers {

    /*
    * Decrementing Large Integers
    * Our startup focuses on optimizing operations for large integers represented as integer arrays.
    * Currently, we're facing a challenge in implementing a function that efficiently decrements a
    * given large integer by one. The expected outcome is an integer array containing the digits of
    * the decremented value.
    *
    * Example 1:
    *   int[] arr = {1, 2, 3, 4};
    *   result should be {1, 2, 3, 3}
    *
    * Example 2:
    *   int[] arr = {9, 9, 9, 9};
    *   result should be {9, 9, 9, 8}
    *
    * Example 3:
    *   int[] arr = {1, 0, 0, 0};
    *   result should be {0, 9, 9, 9}
    *
    * Logic: Convert the array content into a number, subtract 1 and convert it back into an array.
    * */

    public static int[] decrementLargeInteger(int[] arr){

        int number = 0;
        int multiplier = 1;

        for(int i = arr.length-1; i >= 0; i--){
            number += multiplier * arr[i];
            multiplier*=10;
        }

        number = number-1;

        int[] sol = new int[arr.length];
        int index = sol.length-1;
        while (number > 0){
            sol[index--] = number%10;
            number /= 10;
        }

        return  sol;
    }

}
