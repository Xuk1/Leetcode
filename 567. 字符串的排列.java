class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();

        //当s1的长度 ＞ s2的长度，证明s2不可能是s1的排列
        if(n > m){
            return false;
        }

        //使用两个数组分别存储两个字符串中出现的字符的数量，如果数量相等，就代表s2的那n个字符是s1的排列
        int[] store1 = new int[26];
        int[] store2 = new int[26];

        //先判断s2的前n个字符是否是s1的排列，如果是就不用再判断
        for(int i=0; i<n; i++){
            store1[s1.charAt(i) - 'a']++;
            store2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(store1, store2)){
            return true;
        }

        //当s2的前n个字符串不是s1的排列后，使用滑动窗口算法开始向后滑动，再与s1匹配
        //滑动的时候，向后移动一位，最前面的字符数量就会减少一个
        for(int i=n; i<m; i++){
            store2[s2.charAt(i) - 'a']++;
            store2[s2.charAt(i - n) - 'a']--;
            if(Arrays.equals(store1, store2)){
                return true;
            }
        }
        return false;
    }
}

/*
执行用时: 5 ms ,在所有Java提交中击败了 78.76%的用户
内存消耗:38.5 MB，在所有Java提交中击败了 39.87%的用户

滑动窗口算法
*/
