class Solution {
    private boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.valueOf(parts[0]), month = Integer.valueOf(parts[1]) , day = Integer.valueOf(parts[2]);
          int[] daysInMonth = { 31, (isLeap(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
          int result = day;
          for(int  i = 0;i < month - 1;i++){
            result += daysInMonth[i];
          }
          return result;
    }
}