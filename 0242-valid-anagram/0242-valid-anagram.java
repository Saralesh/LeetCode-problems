class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[(int) c - 97]++;
        }
        for(char c : t.toCharArray()){
            count[(int) c - 97]--;
        }
        for(int i = 0;i < 26;i++){
            if(count[i] != 0) return false;
        }  
        return true;      
    }
}