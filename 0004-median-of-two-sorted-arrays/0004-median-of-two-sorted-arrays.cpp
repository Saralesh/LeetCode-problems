class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int l1 = nums1.size();
        int l2 = nums2.size();
        vector<int> merge(l1+l2,0);
        int indx = 0;
        for(int i = 0;i < l1;i++) merge[indx++] = nums1[i];
        for(int j = 0;j < l2;j++) merge[indx++] = nums2[j];
        sort(merge.begin(),merge.end());
        int l = merge.size();
        if(l % 2 != 0) return merge[l/2];
        return (merge[l/2 - 1] + merge[l/2]) / 2.0;        
    }
};