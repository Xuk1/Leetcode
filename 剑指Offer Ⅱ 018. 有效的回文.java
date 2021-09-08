class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        boolean flag = true;
        while(left < right){
            char a = s.charAt(left);
            char b = s.charAt(right);
            if(!Character.isLetterOrDigit(a)){
                left++;
            }else if(!Character.isLetterOrDigit(b)){
                right--;
            }else{
                if(Character.toLowerCase(a) == Character.toLowerCase(b)){
                    left++;
                    right--;
                }else{
                    flag = false;
                    break;
                }
            }
            
        }
        return flag;
    }
}

/*
执行用时: 2 ms ,在所有Java提交中击败了98.68%的用户
内存消耗:38.7 MB ，在所有Java提交中击败了18.96%的用户

如果无法去除所有特殊符号，就判断字符是否是字母或者数字即可
*/
