class Solution {
    public String reverseOnlyLetters(String s) {
        char[] letters = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            char judge = s.charAt(i);
            if(isLetter(judge)){
                letters[cnt++] = judge;
            }
        }
        cnt--;
        for(int j = 0; j < s.length(); j++){
            if(isLetter(s.charAt(j))){
                sb.append(String.valueOf(letters[cnt]));                
                // System.out.println(String.valueOf(letters[cnt]));
                cnt--;
            } else{
                sb.append(String.valueOf(s.charAt(j)));
            }
        }
        return sb.toString();
    }

    public boolean isLetter(char ch){
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            return true;
        }
        return false;
    }
}

/*
执行用时: 1 ms，在所有Java提交中击败了43.97%的用户
内存消耗:39.8 MB，在所有Java提交中击败了 5.02%的用户
*/
