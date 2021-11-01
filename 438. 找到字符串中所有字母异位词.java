class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList<>();
        char[] scnt = new char[26];
        char[] pcnt = new char[26];
        int m = s.length(), n = p.length();
        if(m < n){
            return ret;
        }
        for(int i=0; i<n; i++){
            scnt[s.charAt(i) - 'a']++;
            pcnt[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(scnt, pcnt)){
            ret.add(0);
        }
        for(int i=n; i<m; i++){
            scnt[s.charAt(i-n) - 'a']--;
            scnt[s.charAt(i) - 'a']++;
            if(Arrays.equals(scnt, pcnt)){
                ret.add(i - n + 1);
            }
        }
        return ret;
    }
}

/*
执行用时:7 ms ,在所有Java提交中击败了80.35%的用户
内存消耗:39.4 MB，在所有Java提交中击败了67.70%的用户

滑动窗口
*/
