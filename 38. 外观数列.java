class Solution {
    public String countAndSay(int n) {
       String str = "1";
       for(int i=1; i<n; i++){
           StringBuilder sb = new StringBuilder();
           int start = 0;
           int cur = 0;
           while(cur < str.length()){
               while(cur < str.length() && str.charAt(cur) == str.charAt(start)){
                   cur++;
               }
               sb.append(Integer.toString(cur - start));
               sb.append(str.charAt(start));
               start = cur;
           }
           str = sb.toString();
       }
       return str;
    }
}

/*
执行用时: 8 ms ，在所有Java提交中击败了32.01%的用户
内存消耗:37.7 MB，在所有Java提交中击败了30.90%的用户

根据外观数列的定义，也就是=连续的元素数量+元素。
而连续的元素数量可以通过双指针进行计量。
链接：https://leetcode-cn.com/problems/count-and-say/solution/bian-li-sheng-cheng-by-xsx0119-odta/
*/
