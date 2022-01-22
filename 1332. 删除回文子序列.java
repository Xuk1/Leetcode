class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return 2;
            }
        }
        return 1;
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:36.2MB，在所有Java提交中击败了46.21%的用户
*/
