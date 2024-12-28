class Solution {
    public int[] searchRange(int[] nums, int target) {
      int [] ans = new int[2];
      ans[0] = first(nums, target);
      ans[1] = last(nums, target);
      return ans;
    }
    public static int first(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int firstindex = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                firstindex = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return firstindex;
    }
    public static int last(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int lastindex = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                lastindex = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return lastindex;
    }
} 