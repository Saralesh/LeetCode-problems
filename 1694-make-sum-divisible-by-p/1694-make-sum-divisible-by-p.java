class Solution {
    public int minSubarray(int[] nums, int p) {
        int l = nums.length;
        int sum = 0;
        for(int num : nums){
            sum = (sum + num) % p;
        }
        int target = sum % p;
        if(target == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int currentsum  = 0;
        int minlen = l;
        for(int i =0; i < l;++i){
            currentsum = (currentsum + nums[i]) % p;
            int needed = (currentsum - target + p) % p;
            if(map.containsKey(needed)){
                minlen = Math.min(minlen, i - map.get(needed));
            }
            map.put(currentsum,i);
        }
        return minlen == l ? -1 : minlen;

    }
}