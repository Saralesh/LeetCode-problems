class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> map = new HashSet<>();
        for(int num : arr){
            if(map.contains(2 * num) || (map.contains(num/2) && num%2==0)){
                return true;
            }
            map.add(num);
        }
        return false;
    }
}