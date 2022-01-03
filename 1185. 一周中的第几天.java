class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};         //只用存储前十一个月，因为如果要算12月份，只可能按天数算
        
        int days = (year - 1971) * 365 + (year - 1969) / 4;                 //要加上闰年多的一天
        for(int i = 0; i < (month - 1); i++){
            days += monthDays[i];
        }
        if(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && month >= 3){
            days++;
        }
        days += day;
        return week[(days+3) % 7];
    }
}

/*
执行用时:0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:35.6 MB，在所有Java提交中击败了52.12%的用户
*/
