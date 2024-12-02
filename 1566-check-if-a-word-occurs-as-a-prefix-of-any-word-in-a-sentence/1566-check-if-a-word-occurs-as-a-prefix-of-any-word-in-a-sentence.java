class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" "); // Split the sentence into words
        int index = 1; // 1-based indexing

        for (String word : words) {
            if (isPrefix(word, searchWord)) {
                return index; // Return the index if a prefix match is found
            }
            index++;
        }

        return -1; // Return -1 if no match is found
    }

    // Helper method to check if searchWord is a prefix of word
    private boolean isPrefix(String word, String searchWord) {
        if (searchWord.length() > word.length()) {
            return false; // Prefix cannot be longer than the word
        }
        for (int i = 0; i < searchWord.length(); i++) {
            if (word.charAt(i) != searchWord.charAt(i)) {
                return false; // Characters mismatch
            }
        }
        return true; // All characters matched
    }
}
