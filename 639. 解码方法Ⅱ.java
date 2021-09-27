class Solution {
    final int mod = (int)1e9 + 7;
    public int numDecodings(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        long[] dp = new long[n];
        dp[0] = ch[0] == '*' ? 9 : (ch[0] != '0' ? 1 : 0);
        for(int i=1; i<n; i++){
            char c = ch[i], prev = ch[i-1];
            if(c == '*'){
                dp[i] += 9 * dp[i-1];
                if(prev == '*'){
                    dp[i] += (i-2 >= 0? dp[i-2]: 1) * 15;
                }else{
                    if(prev == '1'){
                        dp[i] += (i-2 >= 0? dp[i-2]: 1) * 9;
                    }else if(prev == '2'){
                        dp[i] += (i-2 >= 0? dp[i-2]: 1) * 6;
                    }
                }
            }else{
                int t = (int)(c - '0');
                if(prev == '*'){
                    if(t == 0){
                        dp[i] += (i-2 >= 0? dp[i-2]: 1) * 2;
                    }else{
                        dp[i] += dp[i-1];
                        if(t <= 6){
                            dp[i] += (i-2 >= 0? dp[i-2]: 1) * 2;
                        }else{
                            dp[i] += (i-2 >= 0? dp[i-2]: 1);
                        }
                    }
                }else{
                    int u = (int)(prev - '0');
                    if(t == 0){
                        if(u == 1 || u == 2){
                            dp[i] += (i-2 >= 0? dp[i-2]: 1);
                        }
                    }else{
                        dp[i] += dp[i-1];
                        if(u == 1 || (u == 2 && t <= 6)){
                            dp[i] += (i-2 >= 0? dp[i-2]: 1);
                        }
                    }
                }
            }
            dp[i] %= mod;
        }
        return (int)(dp[n-1]);
    }
}

/*
执行用时:17 ms ，在所有Java提交中击败了 73.01%的用户
内存消耗:38.9 MB，在所有Java提交中击败了 88.96%的用户

https://leetcode-cn.com/problems/decode-ways-ii/solution/gong-shui-san-xie-fen-qing-kuang-tao-lun-902h/
*/
