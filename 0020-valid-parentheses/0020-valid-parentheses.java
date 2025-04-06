class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(!solve(top,ch)) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static boolean solve(char top,char ch){
        return (top == '(' && ch == ')') ||
               (top == '[' && ch == ']') ||
               (top == '{' && ch == '}');
    }
}