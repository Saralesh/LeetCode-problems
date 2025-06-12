class Solution {
public:
    int maxAdjacentDistance(vector<int>& v) {
        int n = v.size();
        if (n < 2) return 0;
        int maxi = INT_MIN;
        for (int i = 0; i < n - 1; ++i) {
            maxi = max(maxi, abs(v[i] - v[i + 1]));
        }
        maxi = max(maxi, abs(v[n - 1] - v[0]));
        return maxi;
    }
};
