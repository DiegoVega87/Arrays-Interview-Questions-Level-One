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
    * Logic: Use two pointers approach to find and swap the next non-zero element with the first previous
    *   zero element.
    *   Case 1: Both prev and next point to a zero element. Advance next.
    *   Case 2: Previous pointer points to zero element and next pointer points to non-zero element.
    *       Swap and advance both;
    *   Case 3: Either both point to non-zero elements or previous points to a non-zero element.
    *       Advance both pointers.
    *
    *
    *
    * */

    public static void moveZerosToEnd(int[] nums){
        int prev = 0;
        int next = 1;

        while(next < nums.length){
            if(nums[prev] == 0 && nums[next] == 0){
                next++;
            } else if (nums[prev] == 0 && nums[next]!= 0) {
                nums[prev++] = nums[next];
                nums[next++] = 0;
            }else{
                prev++;
                next++;
            }
        }

    }
}
