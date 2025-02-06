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
        int f = arr.get(0);
        int l = arr.get(1);
        if(((s1.charAt(f)) == s2.charAt(l)) && (s1.charAt(l) == s2.charAt(f))){
            return true;
        }
        return false;
    }
}