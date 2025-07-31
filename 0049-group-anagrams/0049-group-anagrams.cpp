#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> groups;  // Using map instead of unordered_map

        for (string s : strs) {
            string key = s;
            sort(key.begin(), key.end());  // Use sorted string as key
            groups[key].push_back(s);
        }

        vector<vector<string>> result;
        for (auto& entry : groups) {
            result.push_back(entry.second);
        }

        return result;
    }
};
