class Solution {
    public String reverseStr(String s, int k) {
        String rev = "";
        String res = "";
        String result = judgeLen(s, k, res, rev);
        return result;
    }
    
    public String judgeLen(String s, int k, String res, String rev){
        int len = s.length();
        StringBuffer strbuf = new StringBuffer(s);
        if(len < k){
            res = res + strbuf.reverse().toString();
            return res;
        }else if(k <= len && len < 2*k){
            rev = s.substring(0, k);
            StringBuffer tmp = new StringBuffer(rev);
            rev = tmp.reverse().toString();
            res = res + rev + s.substring(k, len);
            return res;
        }else if(len >= 2*k){
            rev = s.substring(0, k);
            StringBuffer tmp = new StringBuffer(rev);
            res = res + tmp.reverse().toString() + s.substring(k, 2*k);
            s = s.substring(2*k, len);
            return judgeLen(s, k, res, rev);
        }
        return s;
    }
}

/*
执行用时：7 ms, 在所有 Java 提交中击败了6.08%的用户
内存消耗：39.1 MB, 在所有 Java 提交中击败了5.05%的用户
*/
