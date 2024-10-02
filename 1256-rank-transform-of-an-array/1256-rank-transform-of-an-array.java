class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) return new int[0];
        int[] dup = arr.clone();
        Arrays.sort(dup);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(dup[0],1);
        for(int i = 1;i < arr.length;i++){
            if(dup[i] > dup[i - 1]){
                map.put(dup[i],map.get(dup[i - 1] )+ 1);
            }
            else{
                map.put(dup[i],map.get(dup[i - 1]));
            }
        }
        int[] rankarr = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            rankarr[i] = map.get(arr[i]);
        }
        return rankarr;
    }
}