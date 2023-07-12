public class ZeroMovement {

    /*
    * Zero Movement
    * We are building a platform that requires us to process large amounts of data.
    * We have noticed that our system is slowed down by the presence of zeros in our integer arrays.
    * We need a function that can move all the zeros to the end of the array without changing the order
    * of the other elements. Bonus: Can you achieve this without copying the list (in-place)?
    *
    * Example 1:
    *   int[] nums = {0, 1, 0, 3, 12};
    *   output: [1, 3, 12, 0, 0]
    *
    * Example 2:
    *   int[] nums = {4, 0, 5, 0, 3, 0};
    *   [4, 5, 3, 0, 0, 0]
    *
    * Logic: Traverse the array and left-shift the array when a zero is found.
    *   We need counter to keep track of number of elements found that are NOT zero, so we can efficiently
    *   pad the array with zeros at the end. This will save us from using two for/while loops.
    *
    * */

    public static int[] moveZerosToEnd(int[] nums){

    }
}
