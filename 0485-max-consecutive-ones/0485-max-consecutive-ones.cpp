class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxi = 0;
        int count  = 0;
        for(int i : nums){
            if(i == 1){
                count++;
                maxi = max(count,maxi);
            }
            else{
                count = 0;
            }
        }
        return maxi;
    }
};