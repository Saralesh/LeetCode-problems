class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int,int> map;
        int count = 0;
        int sum = 0;
        map[0] = 1;
        for(int i = 0;i < nums.size();i++){
            sum += nums[i];
            int remove = sum - k;
            count += map[remove];
            map[sum]++;
        }
        return count;     
    }
};