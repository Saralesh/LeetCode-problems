class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = s1.length();
        for(int i = 0;i < n && arr.size() <=2;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                arr.add(i);
            }
        }
        if(arr.size() == 0) return true;
        if(arr.size() != 2) return false;
        if((s1.charAt(arr.get(0)) == s2.charAt(arr.get(1))) && (s1.charAt(arr.get(1)) == s2.charAt(arr.get(0)))){
            return true;
        }
        return false;
    }
}