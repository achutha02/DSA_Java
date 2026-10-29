package Basic_Hashing;

public class SumOfHighestAndLowest_Brute {
    public static int sum(int [] nums){
        int n = nums.length;

        int minFreq = n;
        int maxFreq = 0;

        boolean [] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }

            int freq = 0;

            for(int j = i;j<n;j++){
                if(nums[i] == nums[j]){
                    freq++;
                    visited[i] = true;
                }
            }
            minFreq = Math.min(minFreq,freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        return minFreq + maxFreq;
    }
    public static void main(String[] args) {
        int nums [] = {10,9,7,7,8,8,8};
        int result =  sum(nums);
        System.out.println(result);
    }
}





/*

Time Complexity: O(N2) (where N is the size of the array given) – Using two nested loops.

Space Complexity: O(N) – Using a visited array of size N and a couple of variables.

*/
