class Solution {
public:
    bool isPalindrome(int x) {
        string s = to_string(x);
        int l = s.size();
        for(int i = 0;i < l - 1;i++){
            if(s[i] != s[l - i - 1])  return false;
        }
        return true;
    }
};