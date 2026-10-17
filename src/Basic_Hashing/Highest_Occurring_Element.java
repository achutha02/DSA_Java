package Basic_Hashing;

public class Highest_Occurring_Element {
    public static int mostFrequentElement(int [] arr){
        int n = arr.length;

        int maxFreq = 0;

        int element = 0;

        boolean [] visited = new boolean[n];

        for(int i = 0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int freq = 0;
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    freq++;
                    visited[j] = true;
                }
            }
            if(freq > maxFreq){
                maxFreq = freq;
                element = arr[i];
            }else if(freq == maxFreq && arr[i]<element){
                element = arr[i];
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,3,2,5,4};

        int result = mostFrequentElement(arr);

        System.out.println(result);
    }
}


/*
Time Complexity: O(N2) (where N is the size of the array given) – Using two nested loops.

Space Complexity: O(N) – Using a visited array of size N and a couple of variables.
*/