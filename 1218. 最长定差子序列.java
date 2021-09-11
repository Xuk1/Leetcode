class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int ans = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            int temp = map.getOrDefault(i - difference, 0) + 1;
            map.put(i, temp);
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}

/*
执行用时:37 ms ，在所有Java提交中击败了 75.66%的用户
内存消耗:55.4 MB ，在所有Java提交中击败了33.63%的用户


https://leetcode-cn.com/problems/longest-arithmetic-subsequence-of-given-difference/solution/jian-dan-de-dp-by-97wgl/
*/
