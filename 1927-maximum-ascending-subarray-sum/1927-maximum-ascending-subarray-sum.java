class Solution {
    public int maxAscendingSum(int[] nums) {
      int n = nums.length;
      int max = nums[0];
      int sum = nums[0];
      for(int i = 0;i < n - 1;i++){
        if(nums[i] < nums[i+1]){
            sum += nums[i+1];
        }
        else if(nums[i] > nums[i+1] || nums[i] == nums[i+1]){
           sum = nums[i+1];
            
        }
        max = Math.max(max,sum);
      }
      return max;  
    }
} 