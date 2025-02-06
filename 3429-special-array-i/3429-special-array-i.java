class Solution {
    public boolean isArraySpecial(int[] nums) {
        int l = nums.length;
        if(l == 1)  return true;
        for(int i = 0;i < l - 1;i++){
            if((nums[i] % 2) == (nums[i+1] % 2))   return false; 
        }
        return true;
    }
}