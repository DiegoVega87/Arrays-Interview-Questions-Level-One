public class ArrayRotation {

    /*
    * Write a function that takes an array and an integer n as input and shifts the array to the right by n steps.
    * Return the shifted array.
    *
    * Example 1:
    *   arr = {1, 2, 3, 4, 5};
    *   n = 2;
    *   // shiftedArr should be {4, 5, 1, 2, 3}
    *
    * */

    //Logic:
    // There are three possible cases:
    // Case 1: n < size of the array -> rotate n times
    // Case 2: n == size of the array -> nothing to rotate.
    //  i.e: [1,2,3], n = 3
    //  1st rotation --> [3,1,2]
    //  2nd rotation --> [2,3,1]
    //  3rd rotation --> [1,2,3]
    // Case 3: n > size of the array
    //  the number of actual rotations is n%size
    //  i.e: n = 5, size = 3 --> nRotations = 5%3 = 2
    public static int[] shiftArray(int[] arr, int n){

    }
}
