class Solution {
    public int minSubarray(int[] nums, int p) {
        int l = nums.length;
        int sum = 0;
        for(int num : nums){
            sum = (sum + num) % p; 
        }
        int target = sum % p;
        if(sum == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int minlen = l;
        int currentsum = 0;
        for(int i = 0;i < l;i++){
            currentsum = (currentsum + nums[i]) % p;
            int needed = (currentsum - target + p) % p;
            if(map.containsKey(needed)){
                minlen = Math.min(minlen,i - map.get(needed));
            }
            map.put(currentsum,i);
        }
        if(minlen == l){
        return -1;
    }
    else{
        return minlen;
    }
    } 

}