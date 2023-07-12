import java.util.HashMap;
import java.util.Map;

public class UniqueCustomer {

    /*
    * Identify Unique Customer
    * You have a list of customer IDs in an array called ""customerIDs"".
    * Each customer ID appears twice except for one unique customer.
    *  Write a function to identify the unique customer ID.
    * Can you identify a solution that only needs linear run time?
    *
    * Example 1:
    *   customerIDs = {1, 2, 3, 4, 5, 1, 2, 3, 4};
    *   Output: 5
    *
    * Example 2:
    *   customerIDs = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50};
    *   Output: 60
    *
    * Logic: Traverse the list and keep the frequency of each customer ID along with each customer ID.
    *   Traverse the list with the IDs (as keys) and frequencies (as values) and return the key where
    *   the frequency is 1.
    *
    * */

    public static int findUniqueCustomerId(int[] customerIDs){

        Map<Integer,Integer> IDs = new HashMap<>();

        for(int id : customerIDs){
            int frequency = IDs.getOrDefault(id, 0);
            IDs.put(id, frequency + 1);
        }

        for(Integer key : IDs.keySet()){
           if(IDs.get(key) == 1){
               return key;
           }
        }

        return -1; // There is no unique ID.
    }
}
