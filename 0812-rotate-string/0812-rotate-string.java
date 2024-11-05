class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }
        
        String temp = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
        System.out.println(temp);
        
        if (temp.equals(goal)) {
            return true;
        }
        
        for (int i = 1; i < s.length(); i++) {
            if (temp.equals(goal)) {
                return true;
            }
            temp = temp.charAt(temp.length() - 1) + temp.substring(0, temp.length() - 1);
            
        }
        
        return false;
    }
}
