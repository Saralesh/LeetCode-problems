class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxlen = 1;
        int inclen = 1;
        int declen = 1;
        for(int i = 0;i < n - 1;i++){
            if(nums[i] < nums[i+1]){
                inclen++;
                declen = 1;
            }
            else if(nums[i] > nums[i+1]){
                declen++;
                inclen = 1;
            }
            else{
                inclen = 1;
                declen = 1;
            }
            maxlen = Math.max(maxlen,Math.max(inclen,declen));
        }
        return maxlen;
    }
}