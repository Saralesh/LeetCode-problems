class Solution {
    public String shortestPalindrome(String s) {
        // Reverse the input string
        String rev = new StringBuilder(s).reverse().toString();
        
        // Combine the original string, a separator, and the reversed string
        String combined = s + "#" + rev;
        
        // Build the LPS array for the combined string
        int[] lps = buildLPS(combined);
        
        // Find the length of the longest prefix which is also a suffix
        int maxPrefixLength = lps[lps.length - 1];
        
        // Determine the suffix to add to the beginning of the original string
        String suffixToAdd = rev.substring(0, rev.length() - maxPrefixLength);
        
        // Return the shortest palindrome
        return suffixToAdd + s;
    }

    // Function to build the LPS array
    private int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
