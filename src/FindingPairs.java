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
    *   number so that their sum is equal to the target. If the complement does not exist in the map, add it
    *   to the map, if it exists, we reached the answer!
    *   get the value corresponding to the complement and store it in the array as the first entry, then add the
    *   current index to the array as the second element.
    * */

    public static int[] findProductIndices(int[] prices, int target){

    }
}
