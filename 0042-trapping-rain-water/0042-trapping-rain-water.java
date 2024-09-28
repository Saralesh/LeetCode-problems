class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lmax = height[left];
        int rmax = height[right];
        int Totalwtr = 0;
        while(left < right){
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);
            Totalwtr += (lmax <= rmax) ? (lmax - height[left++]) : (rmax - height[right--]);
        }
        return Totalwtr;
    }
}