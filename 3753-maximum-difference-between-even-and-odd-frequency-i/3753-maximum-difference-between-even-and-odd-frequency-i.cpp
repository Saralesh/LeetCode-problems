class Solution {
public:
    int maxDifference(string s) {
        int freq[26] = {0};
        for(char ch : s){
            freq[ch - 97]++;
        }
        int even[26] = {0};
        int odd[26] = {0};
        int in = 0;
        int jn  = 0;
        for(int i = 0;i < 26;i++){
            if(freq[i] > 0 && freq[i] % 2 == 0){
                even[in++] = freq[i];
            }
            else if(freq[i] > 0 && freq[i] % 2 != 0){
                odd[jn++] = freq[i];
            }
        }
        sort(odd,odd+jn);
        sort(even, even + in);
        reverse(odd, odd + jn);
        cout << odd[0] << " " << even[0];
        return (odd[0] - even[0]);
    }
};