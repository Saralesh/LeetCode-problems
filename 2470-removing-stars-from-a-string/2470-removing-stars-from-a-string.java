class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length();i++){
           char ch = s.charAt(i);
            if(s.charAt(i) == '*'){
                result.deleteCharAt(result.length() - 1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}