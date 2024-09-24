class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), 0, n);
        return res;
    }

    private void backtrack(List<List<String>> res, List<Integer> pos, int row, int n) {
        if (row == n) {
            res.add(formString(pos));
        }
        for (int col = 0; col < n; ++col) {
            if (isValid(pos, row, col)) {
                pos.add(col);
                backtrack(res, pos, row + 1, n);
                pos.remove(pos.size() - 1);
            }
        }
    }

    private boolean isValid(List<Integer> pos, int row, int col) {
        for (int rowTaken = 0; rowTaken < pos.size(); ++rowTaken) {
            int colTaken = pos.get(rowTaken);
            if (col == colTaken || Math.abs(row - rowTaken) == Math.abs(col - colTaken)) {
                return false;
            }
        }
        return true;
    }
    
    private List<String> formString(List<Integer> pos) {
        List<String> res = new ArrayList<>();
        int n = pos.size();
        for (int col : pos) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; ++j) {
                if (j == col) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}