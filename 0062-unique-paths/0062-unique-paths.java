class Solution {
    public int uniquePaths(int m, int n) {
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = 1;
        }
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                arr[j] += arr[j-1];
            }
        }
        return arr[n-1];
    }
}