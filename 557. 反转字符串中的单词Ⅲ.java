class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            int start = i;
            while(i < s.length() && s.charAt(i) != ' '){
                i++;
            }
            for(int j=start; j<i; j++){
                sb.append(s.charAt(start + i - 1 - j));
            }
            while(i < s.length() && s.charAt(i) == ' '){
                i++;
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

/*
执行用时:7 ms ，在所有Java提交中击败了40.85%的用户
内存消耗:38.7 MB，在所有Java提交中击败了93.27%的用户

双指针
StringBuilder所需的时间和空间较少，性能好
*/
