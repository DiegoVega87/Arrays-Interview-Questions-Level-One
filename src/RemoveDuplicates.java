import java.util.Arrays;

public class RemoveDuplicates {

    /*
    * As a startup, you have a database of customer information sorted in non-decreasing order. However,
    * there are duplicate entries that need to be removed in-place such that each unique customer appears only once.
    * The relative order of the customers should be kept the same. Write a function that takes in the database as
    * an integer array and returns the number of unique customers in the database after removing duplicates.
    * */

    public static Integer removeDuplicates(int[] nums){

        // Check for empty array
        if(nums.length == 0){
            return 0;
        }

        // Create unique array of size original array in case input array contains no duplicates.
        int[] unique = new int[nums.length];

        //The first element will automatically be the first unique value
        unique[0] = nums[0];

        //Index will be the pointer where the NEXT element unique element from nums will be placed in the resulting array
        //Index will also tell us how many unique elements there are.
        int index = 1;

        //Traverse the original array and keep only unique values
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != unique[index-1]){
                unique[index++] = nums[i];
            }
        }

        return index;

    }
}
