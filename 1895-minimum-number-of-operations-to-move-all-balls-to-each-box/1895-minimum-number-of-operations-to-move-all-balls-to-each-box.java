class Solution {
    public int[] minOperations(String boxes) {
       int l = boxes.length();
       int[] arr = new int[l];
       int count = 0;
       int moves = 0;
       for(int i = 0; i < l; i++) {
            arr[i] = moves;
            count += (boxes.charAt(i) - '0');
            moves += count;
       }       
       moves = 0;
       count = 0;    
       for(int i = l - 1; i >= 0; i--) {
            arr[i] += moves;
            count += (boxes.charAt(i) - '0');
            moves += count;       
       }    
       return arr;
    }
}
