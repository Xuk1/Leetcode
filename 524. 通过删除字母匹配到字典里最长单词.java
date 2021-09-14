class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for(String t : dictionary){
            int i = 0, j = 0;
            while(i < s.length() && j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    j++;
                }
                i++;
            }
            if(j == t.length()){
                if(t.length() > res.length() || ( t.length() == res.length() && t.compareTo(res) < 0))
                res = t;
            }
        }
        return res;
    }
}

/*
执行用时: 21 ms ,在所有Java提交中击败了54.25%的用户
内存消耗:39.1 MB，在所有Java提交中击败了89.37%的用户

使用双指针，贪心算法匹配字符串
*/
