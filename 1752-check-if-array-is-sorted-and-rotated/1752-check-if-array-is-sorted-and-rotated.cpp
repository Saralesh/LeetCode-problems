class Solution {
public:
    bool check(vector<int>& arr) {
        int n = arr.size();
        int c = 0;
        for(int i = 0;i <n-1;i++){
            if(arr[i] > arr[i+1]) c++;
            if(c > 1) return false;
        }
        if(arr[n-1] > arr[0]) c++;
        return(c <= 1);
    }
};