class Solution {
    public int countSegments(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0; i<n; i++){
            if(i == 0 && s.charAt(i) != ' '){
                count++;
            }
            if(i >= 1){
                if(s.charAt(i-1) == ' ' && s.charAt(i) != ' '){
                    count++;
                }
            }
        }
        return count;
    }
}

/*
执行用时: 0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:36.1 MB，在所有Java提交中击败了 63.08%的用户
*/
