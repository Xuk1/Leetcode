class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int cnt = 0, ans = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                cnt++;
            }else if (s.charAt(i) == ')'){
                cnt--;
            }
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:36.4 MB，在所有Java提交中击败了 78.00%的用户

思路
题目就是求括号的最大嵌套深度，并且题目只会出现有效括号字符串，所以我们不用考虑无效括号字符串的情况。
根据题意，其实就是求最大的连续左括号的数量（跳过普通字符，且与 ) 抵消后），只需要边遍历边统计即可。

感悟
这种括号匹配问题，还有另外一个题型，就是判断是否是有效括号字符串——这种就需要用堆来匹配。
本道题这种题型的话，主要是需要弄清楚题意，找到合适的方法。
*/
