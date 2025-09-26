#include <vector>
using namespace std;

class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int r = matrix.size();
        int c = matrix[0].size();
        vector<vector<int>> result = matrix;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    solve(result, i, j);
                }
            }
        }
        matrix = result;
    }
    
private:
    void solve(vector<vector<int>>& result, int row, int col) {
        int r = result.size();
        int c = result[0].size();
        for (int j = 0; j < c; j++) result[row][j] = 0;
        for (int i = 0; i < r; i++) result[i][col] = 0;
    }
};
