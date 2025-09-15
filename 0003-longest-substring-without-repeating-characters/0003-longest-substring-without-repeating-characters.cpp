class Solution {
public:
    int lengthOfLongestSubstring(string s) {
       set<char> seen;
       int start = 0, end = 0;
       int res = min((int)s.length(), 1);
       while(end < s.length()){
           char ch = s[end];
           while(seen.find(ch) != seen.end()){
               seen.erase(s[start]);
               start++;
           }
           seen.insert(ch);
           int size = end - start + 1;
           res = max(res, size);
           end++;
       }
       return res;
    }
};
