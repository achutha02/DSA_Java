package Basic_Hashing;

public class SecondHighestOccurringElement_Brute {
    public static int secondMostOccurring(int [] nums){
        int n = nums.length;

        int maxFreq = 0;
        int secMaxFreq = 0;

        int maxEle = -1;
        int secMaxEle = -1;

        boolean [] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int freq = 0;
            for(int j=i;j<n;j++){
                if(nums[i] == nums[j]){
                    freq++;
                    visited[j] = true;
                }
            }
            if(freq > maxFreq){
                secMaxFreq = maxFreq;
                maxFreq = freq;
                secMaxEle = maxEle;
                maxEle = nums[i];
            }
            else if(freq == maxFreq){
                secMaxEle = Math.min(maxEle,nums[i]);
            }
            else if(freq > secMaxFreq){
                secMaxFreq = freq;
                secMaxEle = nums[i];
            }
            else if(freq == secMaxFreq){
                secMaxEle = Math.min(secMaxEle, nums[i]);
            }
        }
        return secMaxEle;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3};
        int result = secondMostOccurring(nums);
        System.out.println(result);
    }
}



/*

Time Complexity: O(N2) (where N is the size of the array given) – Using two nested loops.

Space Complexity: O(N) – Using a visited array of size N and a couple of variables.

*/
