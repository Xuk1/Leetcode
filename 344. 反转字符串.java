class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}

/*
执行用时:1 ms ，在所有Java提交中击败了 96.37%的用户
内存消耗:45 MB，在所有Java提交中击败了45.41%的用户

双指针
*/
