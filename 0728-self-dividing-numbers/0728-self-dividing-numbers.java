class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List <Integer> arr = new ArrayList<>();
       for(int i = left;i<=right;i++){
        if(solve(i))
            arr.add(i);
       }
       return arr;
    }
    public static boolean solve(int num){
        int originalnum = num;
        while(num != 0){
            int rem = num % 10;
            if(rem == 0 || originalnum % rem != 0)
                return false;
            
            num /= 10;
        }
        return true;
    }
}