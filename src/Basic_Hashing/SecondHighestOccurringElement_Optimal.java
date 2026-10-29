package Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccurringElement_Optimal {
    public static int secondMostOccuring(int [] nums){
        int n = nums.length;

        int maxEle = -1;
        int secMaxEle = -1;

        int maxFreq = 0;
        int secMaxFreq = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it : mpp.entrySet()){
            int ele = it.getKey();
            int freq = it.getValue();

            if(freq > maxFreq){
                secMaxFreq = maxFreq;
                maxFreq = freq;
                secMaxEle = maxEle;
                maxEle = ele;
            }
            else if(freq == maxFreq){
                maxEle = Math.min(maxEle,ele);
            }
            else if(freq > secMaxFreq){
                secMaxEle = ele;
                secMaxFreq = freq;
            }
            else if(freq == secMaxFreq){
                secMaxEle = Math.min(secMaxEle,ele);
            }
        }
        return secMaxEle;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3};
        int result = secondMostOccuring(nums);
        System.out.println(result);
    }
}




/*

Time Complexity: O(N) (where N is the size of the array given) –

Using a single loop, performing insertion, and updation operations on HashMap takes O(1) TC resulting in O(N) TC.
Iterating on HashMap will take O(N) in the worst-case
Space Complexity: O(N) – In the worst-case scenario, the HashMap will store all the elements in the array when array elements are unique.


*/
