class Solution {
public:
    string removeDigit(string number, char digit) {
        string max = "";
        for(int i = 0;i < number.size();i++){
            if(number[i] == digit){
                string temp = number.substr(0,i) + number.substr(i+1);
                if(temp == "" || temp > max)  max = temp;
            }
        }
        return max;
    }
};