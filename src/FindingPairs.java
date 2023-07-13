import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindingPairs {

    /*
    * We have a list of numbers representing the prices of our products. We want to create a feature
    * that allows our users to search for pairs of products whose prices add up to a specific target amount.
    * Write a function that takes in an array of integers representing the prices of our products and an integer target,
    * and returns the indices of the two products whose prices add up to the target amount.
    * Each product can only be used once and the output can be in any order.
    *
    * Example 1:
    *   prices = {10, 20, 30, 40, 50};
    *   target = 60;
    *   expectedOutput = {0, 4};
    *   Explanation: The prices at indices 0 and 4 add up to the target amount of 60.
    *
    * Example 2:
    *   prices = {5, 15, 25, 35, 45};
    *   target = 40;
    *   expectedOutput = {1, 2};
    *
    * Logic: Traverse the array and, on each iteration, calculate the number that complements the current
    *   number so that their sum is equal to the target. If the complement does not exist in the map, add the
    *   current value to the map as the key and its index as the value. If it exists, we reached the answer!
    *   get the value corresponding to the complement and store it in the array as the first entry, then add the
    *   current index to the array as the second element.
    * */


    public static int[] findProductIndices(int[] prices, int target){

        // Create and initialize array that will contain the desired indexes if the solution is plausible.
        int[] index = {-1,-1};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < prices.length;i++){
            int complement = target - prices[i];
            if(!map.containsKey(complement)){
                map.put(prices[i], i);
            }else{
                index[0] = map.get(complement);
                index[1] = i;
                break; // Stop looping, we have the answer!
            }
        }

        return index;
    }
}
