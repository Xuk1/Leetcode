class Solution {
    public String[] findWords(String[] words) {
        List<String> ret = new ArrayList<>();
        int n = words.length;
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        boolean flag = true;
        for(int i=0; i<n; i++){
            String cmp = words[i].toLowerCase();
            if(s1.indexOf(cmp.charAt(0)) != -1){
                flag = true;
                for(int j=1; j<cmp.length(); j++){
                    if(s1.indexOf(cmp.charAt(j)) == -1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ret.add(words[i]);
                }    
            }else if(s2.indexOf(cmp.charAt(0)) != -1){
                flag = true;
                for(int j=1; j<cmp.length(); j++){
                    if(s2.indexOf(cmp.charAt(j)) == -1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ret.add(words[i]);
                }
            }else if(s3.indexOf(cmp.charAt(0)) != -1){
                flag = true;
                for(int j=1; j<cmp.length(); j++){
                    if(s3.indexOf(cmp.charAt(j)) == -1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ret.add(words[i]);
                }
            }
        }
        return ret.toArray(new String[ret.size()]);
    }
}

/*
执行用时:0ms，在所有Java提交中击败了100.00%的用户
内存消耗:36.3 MB，在所有Java提交中击败了 70.77%的用户

* 因为大小写的原因，需要统一转换成小写再来判断
* 先判断该字符串的第一个字符在哪一行，再判断该字符串的其他字符串是否在同一行
* 因为不确定数组的长度，所以我们使用list，结果再用`list.toArray(new String[list.size()])`把结果转换成String数组
*/
