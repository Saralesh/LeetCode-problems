class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int> result;
        int total = (int)pow(2,n);
        for(int i = 0;i < total;i++){
            result.push_back(i ^ (i >> 1));
        }
        return result;
    }
};