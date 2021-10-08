class Solution {
    final int L = 10;
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ret = new ArrayList<>();                   //存储返回的子串序列
        Map<String, Integer> map = new HashMap<>();             //存储每个不重复子串出现的次数
        int n = s.length();                                     //字符串的长度
        for(int i=0; i<=n-L; i++){
            String sub = s.substring(i, i+L);                   //子串
            map.put(sub, map.getOrDefault(sub, 0)+1);           //存储子串出现的次数
            if(map.get(sub) == 2){                              //当该子串出现次数=2的时候就可以加到返回的字串序列中
                ret.add(sub);
            }
        }
        return ret;
    }
}

/*
执行用时:25 ms 在所有Java提交中击败了14.88%的用户
内存消耗:47MB ，在所有Java提交中击败了46.83%的用户

使用哈希表存储不重复子串的出现次数
可以使用substring函数快速获得连续的子串
getOrDefault函数可以快速判定选用哪个值
*/
