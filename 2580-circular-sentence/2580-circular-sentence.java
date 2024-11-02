class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        if(s.length == 1){
            String c = s[0];
            if(c.charAt(0) == c.charAt(c.length() - 1)){
                return true;
            }
            else{
                return false;
            }

        }
        

        for(int i = 0;i < s.length - 1;i++){
            String p = s[i];
            String c = s[i+1];
            String e = s[s.length - 1];
            String f = s[0];
            if(p.charAt(p.length() - 1) != c.charAt(0) || e.charAt(e.length() - 1) != f.charAt(0)){
                return false;
            }
        }
        return true;
        
        
        
    }
}