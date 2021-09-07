class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        if(s == null || s.length() == 1){
            return res;
        }

        for(int i=0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == 'R'){
                count++;
            }else if(tmp == 'L'){
                count--;
            }
            if(count == 0){
                res++;
            }
        }
        return res;
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:35.9 MB ，在所有Java提交中击败了97.41%的用户
*/






class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        if(s == null || s.length() == 1){
            return res;
        }

        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("R")){
                count++;
            }else if(str[i].equals("L")){
                count--;
            }
            if(count == 0){
                res++;
            }
        }
        return res;
    }
}

/*
执行用时:7 ms ,在所有Java提交中击败了9.39%的用户
内存消耗:38.3 MB，在所有Java提交中击败了 5.03%的用户
*/
