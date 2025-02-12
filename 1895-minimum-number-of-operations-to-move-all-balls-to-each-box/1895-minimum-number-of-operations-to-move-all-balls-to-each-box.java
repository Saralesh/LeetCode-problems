class Solution {
    public int[] minOperations(String boxes) {
        int l = boxes.length();
        int[] res = new int[l];
        for(int i = 0;i < l;i++){
            int result = 0;
            for(int j = 0;j < l;j++){
                result += (boxes.charAt(j) - '0') * Math.abs(i - j);
            }
            res[i] = result;
        }
        return res;
    }
}