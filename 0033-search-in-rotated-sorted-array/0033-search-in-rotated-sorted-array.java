class Solution {
    public static int search(int[] nums, int target) {
        int piv = pivot(nums);
        if(piv == -1){
            return binarysearch(nums,0,nums.length - 1,target);
        }
        if(nums[piv] == target){
            return piv;
        }
        if(nums[0] <= target){
            return binarysearch(nums,0,piv - 1,target);
        }
        return binarysearch(nums,piv + 1,nums.length - 1,target);
    }
    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(end > mid && nums[mid] > nums[mid + 1] ){
                return mid;
            }
            if(start < mid && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return - 1;
    }
    public static int binarysearch(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}