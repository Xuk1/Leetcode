class Solution {
    public String reversePrefix(String word, char ch) {
        int subIdx = -1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                subIdx = i;
                break;
            }
        }
        if(subIdx == -1){
            return word;
        }
        String subWord = word.substring(0, subIdx + 1);
        int len = subWord.length();
        char[] change = new char[len];
        for(int i = 0; i < len; i++){
            change[len - i - 1] = subWord.charAt(i);
        }
        String ret = String.valueOf(change) + word.substring(subIdx + 1, word.length());
        return ret;
    }
}

/*
执行用时: 1 ms ，在所有Java提交中击败了 24.64%的用户
内存消耗:39.2 MB ，在所有Java提交中击败了92.17%的用户
*/
