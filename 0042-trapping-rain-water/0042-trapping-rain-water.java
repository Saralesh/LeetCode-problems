class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lmax = height[left];
        int rmax = height[right];
        int Totalwtr = 0;
        while(left < right){
            if(lmax <= rmax){
                Totalwtr += lmax - height[left++];
                lmax = Math.max(height[left], lmax);
            }else{
                Totalwtr += rmax - height[right--];
                rmax = Math.max(height[right], rmax);
            }
        }
        
        return Totalwtr;
    }
}