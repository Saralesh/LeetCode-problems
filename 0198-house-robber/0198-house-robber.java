class Solution {
    public int rob(int[] a) {
       int l = a.length;
       if(l == 0) return 0;
       if(l == 1) return a[0];
        int[] maxarr = new int[l];
        maxarr[0] = a[0];
        maxarr[1] = Math.max(a[0],a[1]);
        for(int i = 2;i < l;i++){
            maxarr[i] = Math.max(maxarr[i-1],a[i] + maxarr[i-2]);
        }
        return (maxarr[l -1 ]);
    }

}
