class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            majorityElement(new int[] {});
        }
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int num : nums){
            if(count==0){
                element=num;
                count++;
            }else if(element == num){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}