class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<int> last(256,-1);
        int start = 0;
        int maxlen = 0;
        for(int i = 0;i < s.size();i++){
            char ch = s[i];
            if(last[ch] >= start) start = last[ch] + 1;
            last[ch] = i;
            maxlen = max(maxlen,i - start + 1);
        }
        return maxlen;
    }
};