class Solution {
    public int splitArray(int[] nums, int k) {
       if(k > nums.length) return -1;
       int n = nums.length;
       int start = Integer.MIN_VALUE;
       int end = 0;
       for(int i : nums){
        start = Math.max(start,i);
        end += i;
       }
       int result = -1;
       while(start <= end){
        int mid = start + (end - start) / 2;
        if(isSolve(nums,n,k,mid)){
            result = mid;
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
       }
       return result;
    }
    public static boolean isSolve(int[] nums,int n,int k,int mid){
        int no_students = 1, pages_sum = 0;
        for(int pages : nums){
            if(pages_sum + pages > mid){
                no_students++;
                pages_sum = pages;
                if(no_students > k) return false;
            }
            else{
                pages_sum += pages;
            }
        }
        return true;
    }
}