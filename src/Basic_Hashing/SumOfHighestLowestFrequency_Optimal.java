package Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

public class SumOfHighestLowestFrequency_Optimal {
    public static int sum(int [] nums){

        int n = nums.length;

        int minFreq = n;
        int maxFreq = 0;

        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(int freq : mpp.values()){
            minFreq = Math.min(minFreq,freq);
            maxFreq = Math.max(maxFreq,freq);
        }
        return minFreq + maxFreq;
    }
    public static void main(String[] args) {
        int nums [] = {10,9,7,7,8,8,8};
        int result = sum(nums);
        System.out.println(result);
    }
}



/*

Time Complexity: O(N) (where N is the size of the array given) –
   --> Iterating the array results in O(N) TC. In every iteration, the hashmap is updated, which is a constant time operation. This results in overall O(N) TC.
   --> Iterating on HashMap, will take O(N) in the worst-case.

Space Complexity: O(N) – In the worst-case scenario, the HashMap will store all the elements in the array when array elements are unique.

*/
