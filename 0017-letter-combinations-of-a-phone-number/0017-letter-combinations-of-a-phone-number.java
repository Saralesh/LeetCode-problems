class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        Map<Character, String> keyboard = new HashMap<>();
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");

        List<String> output = new ArrayList<>();
        backtrack(output, keyboard, digits, "", 0);
        return output;
    }

    private void backtrack(List<String> output, Map<Character, String> keyboard, String digits, String current, int index) {
        if (index == digits.length()) {
            output.add(current);
            return;
        }
        String letters = keyboard.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            backtrack(output, keyboard, digits, current + letter, index + 1);
        }
    }
}