class Solution {
    public boolean backspaceCompare(String s, String t) {
        int m = s.length(), n = t.length();
        if(m == 0 && n == 0){
            return true;
        }
        StringBuffer sn = new StringBuffer();
        StringBuffer tn = new StringBuffer();
        for(int i=0; i<m; i++){
            if(s.charAt(i) != '#'){
                sn.append(s.charAt(i));
            }else{
                if(sn.length() > 0){
                    sn.deleteCharAt(sn.length()-1);
                }
            }
        }
        for(int i=0; i<n; i++){
            if(t.charAt(i) != '#'){
                tn.append(t.charAt(i));
            }else{
                if(tn.length() > 0){
                    tn.deleteCharAt(tn.length()-1);
                }
            }
        }
        return sn.toString().equals(tn.toString());
    }
}

/*
执行用时: 1 ms ,在所有Java提交中击败了 64.26%的用户
内存消耗:36.7 MB，在所有Java提交中击败了35.67%的用户
*/
