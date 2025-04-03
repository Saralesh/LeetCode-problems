class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0; // Store the maximum triplet value
        
        int n = nums.length;
        
        // Iterate through all triplets (i, j, k)
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long val = (long)(nums[i] - nums[j]) * nums[k];
                    max = Math.max(max, val);
                }
            }
        }
        
        return max;
    }
}
