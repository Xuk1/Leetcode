class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int len = str[str.length - 1].length();
        return len;
    }
}

/*
执行用时: 1 ms ，在所有Java提交中击败了 37.87%的用户
内存消耗:36.8 MB ，在所有Java提交中击败了25.52%的用户
*/
