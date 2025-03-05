class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> presum = new HashMap<>();
       int count = 0;
       int currsum = 0;
       for(int i = 0;i < nums.length;i++){
        currsum += nums[i];
        if(currsum == k) count += 1;
        if(presum.containsKey(currsum - k)){
            count += presum.get(currsum - k);
        }
        presum.put(currsum,presum.getOrDefault(currsum,0) + 1);
       }
       return count;
       
    }
}