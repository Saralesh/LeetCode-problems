class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i+1]){
                c += 1;
            }
            if( c > 1){
                return false;
            }
        }
        if(nums[n - 1] > nums[0]){
            c += 1;
        }
        return (c <= 1); 


    }
}