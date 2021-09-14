class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}

/*
执行用时: 6 ms ,在所有Java提交中击败了 75.63%的用户
内存消耗:38 MB ，在所有Java提交中击败了98.19%的用户

使用滑动窗口算法
*/
