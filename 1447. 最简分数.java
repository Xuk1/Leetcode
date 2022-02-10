class Solution {
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public List<String> simplifiedFractions(int n) {
        List<String> ret = new ArrayList<>();                //用list保存返回的字符串序列
        for(int i = 1; i < n; i++){                     //i作为分子
            for(int j = i+1; j <= n; j++){                //j作为分母
                if(gcd(i, j) == 1){
                    ret.add(i + "/" + j);
                }
            }
        }
        return ret;
    }
}


/*
执行用时: 22 ms ，在所有Java提交中击败了35.46%的用户
内存消耗:42.1 MB，在所有Java提交中击败了12.41%的用户
*/
