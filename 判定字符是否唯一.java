class Solution {
    public boolean isUnique(String astr) {
        boolean flag = true;
        String[] s = astr.split("");
        Arrays.sort(s);
        for(int i=0; i<s.length; i++){
            for(int j=i+1; j<s.length; j++){
                if(s[i].equals(s[j])){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

/*
执行用时:2 ms ，在所有Java提交中击败了 5.71%的用户
内存消耗:36.1 MB ，在所有Java提交中击败了59.14%的用户
*/
