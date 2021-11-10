class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ret = 0;
        for(int i=1; i<timeSeries.length; i++){
            if(timeSeries[i-1] + duration > timeSeries[i]){
                ret += timeSeries[i] - timeSeries[i-1];
            }else{
                ret += duration;
            }
        }
        ret += duration;
        return ret;
    }
}

/*
执行用时:3 ms ,在所有Java提交中击败了9.56%的用户
内存消耗:40.1 MB，在所有Java提交中击败了69.68%的用户
*/
