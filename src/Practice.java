import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static int mostFrequentElement(int [] nums){
        int n = nums.length;

        int maxFreq = 0;
        int maxEle = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it : mpp.entrySet()){
            int ele = it.getKey();
            int freq = it.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                maxEle = ele;
            } else if (freq == maxFreq) {
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
