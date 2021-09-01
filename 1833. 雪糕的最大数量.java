class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for(int i=0; i<costs.length; i++){
            if(coins >= costs[i]){
                res++;
                coins -= costs[i];
            }
        }
        return res;
    }
}

/*
执行用时:38 ms，在所有Java提交中击败了80.46%的用户
内存消耗:55MB ，在所有Java提交中击败了33.60%的用户
*/
