class Solution {
    public int lengthOfLongestSubstring(String s) {
     int start = 0;
     int end = 0;
     int maxlen = Math.min(s.length(),1);
     Set<Character> seen = new HashSet<>();
     while(end < s.length()){
        char c = s.charAt(end);
        while(seen.contains(c)){
            seen.remove(s.charAt(start));
            start++;
        }
        seen.add(c);
        int size = end - start + 1;
        maxlen = Math.max(maxlen,size);
        end++;
    
     }
     return maxlen;   
    }

}