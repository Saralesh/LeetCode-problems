class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lmax = 0, rmax = 0, total = 0;
        while(left < right){
            if(height[left] <= height[right]){
                lmax = Math.max(lmax,height[left]);
                total += lmax - height[left];
                left++;
            }
            else{
                rmax = Math.max(rmax,height[right]);
                total += rmax - height[right];
                right--;
            }
        }
        return total;
    }
}