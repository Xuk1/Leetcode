class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for(int i=0; i+n <= m; i++){
            boolean flag = true;
            for(int j=0; j<n; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}

/*
执行用时:1430 ms ,在所有Java提交中击败了12.84%的用户
内存消耗:37.9 MB ，在所有Java提交中击败了78.78%的用户
*/
