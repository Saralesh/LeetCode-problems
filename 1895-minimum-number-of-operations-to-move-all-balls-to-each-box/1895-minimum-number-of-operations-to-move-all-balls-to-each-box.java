class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int count = 0, moves = 0;
        for (int i = 0; i < n; i++) {
            res[i] = moves;
            count += (boxes.charAt(i) - '0');
            moves += count;
        }
        count = 0;
        moves = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[i] += moves;
            count += (boxes.charAt(i) - '0');
            moves += count;
        }
        return res;
    }
}
