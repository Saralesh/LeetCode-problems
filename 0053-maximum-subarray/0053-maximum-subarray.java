class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            maxi = sum > maxi ? sum : maxi;
            sum = sum < 0 ? 0 : sum;       
        }
       
        return maxi;
    }
}