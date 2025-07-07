class Solution {
public:
    int countSubarrays(vector<int>& nums) {
        int l = nums.size();
        int count = 0;
        for(int i = 0;i <= l - 3;i++){
            if((nums[i+1] / 2.0) == (nums[i]+nums[i+2])) count++;
        }
        return count;
    }
};