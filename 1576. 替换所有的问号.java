class Solution {
    public String modifyString(String s) {
        int n = s.length();
        char[] choice = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};   //用于选择替换字母的数组
        char[] store = s.toCharArray();                             //把字符转换成字符串数组方便操作

        if(n == 1 && store[0] == '?'){                              
            store[0] = 'a';
        }

        for(int i = 0; i < n; i++){
            if(store[i] == '?' && i > 0 && i < n-1){
                for(int j = 0; j < 26; j++){
                    if(choice[j] != store[i-1] && choice[j] != store[i+1]){
                        store[i] = choice[j];
                        break;
                    }
                }
            }else if(store[i] == '?' && i == 0){
                for(int j = 0; j < 26; j++){
                    if(choice[j] != store[i+1]){
                        store[i] = choice[j];
                        break;
                    }
                }
            }else if(store[i] == '?' && i == n-1){
                for(int j = 0; j < 26; j++){
                    if(choice[j] != store[i-1]){
                        store[i] = choice[j];
                        break;
                    }
                }
            }
        }
        String ret = new String(store);
        return ret;
    }
}

/*
执行用时:1 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:38.6 MB ，在所有Java提交中击败了15.35%的用户

https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/solution/lemonie-zi-fu-chuan-zhuan-huan-xiao-bai-f2fyk/
*/
