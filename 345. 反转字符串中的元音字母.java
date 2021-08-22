import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        char[] carr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<carr.length; i++){
            if(carr[i] == 'a' || carr[i] == 'e' || carr[i] == 'i' || carr[i] == 'o' || carr[i] == 'u' || carr[i] == 'A' || carr[i] == 'E' || carr[i] == 'I' || carr[i] == 'O' || carr[i] == 'U'){
                list.add(i);
            }
        }
        String res = String.valueOf(reverse(carr, list));
        return res;
    }
    public char[] reverse(char[] carr, List list){
        int len = list.size();
        int left = 0;
        int right = len-1; 
        while(left < right){
            int le = (int)list.get(left);
            int ri = (int)list.get(right);
            char tmp = carr[le];
            carr[le] = carr[ri];
            carr[ri] = tmp;
            left++;
            right--;
        }
        return carr;
    }
}

/*
执行用时：5 ms, 在所有 Java 提交中击败了29.52%的用户
内存消耗：38.8 MB, 在所有 Java 提交中击败了15.54%的用户
*/
