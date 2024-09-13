class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] merge = new int[l1 + l2];
        int index = 0;
        for(int i = 0; i < l1; i++){
            merge[index++] = nums1[i];
        }
        for(int i = 0; i < l2; i++){
            merge[index++] = nums2[i];
        }
        Arrays.sort(merge);
        int l = merge.length;
        if(l % 2 != 0){
            return (double) merge[l/2];
        }
        else if (l % 2 == 0){
            int t1 = merge[l/2 - 1];
            int t2 = merge[l/2];
            return (double) ((t1 + t2) / 2.0);
        }
        return 0;
    }
}