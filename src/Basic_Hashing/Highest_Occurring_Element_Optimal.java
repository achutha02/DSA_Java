package Basic_Hashing;

import java.util.*;
public class Highest_Occurring_Element_Optimal {
    public static int mostFrequentElement(int [] arr){

        int n = arr.length;

        int maxFreq = 0;

        int maxEle = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> it: mpp.entrySet()){
            int ele = it.getKey();
            int freq = it.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                maxEle = ele;
            }
            else if(freq == maxFreq){
                maxEle = Math.min(maxEle, ele);
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        int [] nums = {4,4,5,5,6};
        int result = mostFrequentElement(nums);
        System.out.println(result);
    }
}


/*
Time Complexity: O(N) (where N is the size of the array given) –

  --> Using a single loop, performing insertion, updation opertion on HashMap takes O(1) TC resulting in O(N) TC.
  --> Iterating on HashMap, will take O(N) in the worst-case

Space Complexity: O(N) – In the worst-case scenario, the HashMap will store all the elements in the array when array elements are unique.
*/
