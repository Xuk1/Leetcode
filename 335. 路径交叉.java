class Solution {
    public boolean isSelfCrossing(int[] distance) {
        for(int i=3; i<distance.length; i++){
            if(distance[i-1] <= distance[i-3] && distance[i] >= distance[i-2]){
                return true;
            }
            if(i == 4 && distance[3] == distance[1] && distance[4] >= distance[2]-distance[0]){
                return true;
            }
            if(i >= 5 && distance[i-1] >= distance[i-3]-distance[i-5] && distance[i-1] <= distance[i-3] && distance[i-2] > distance[i-4] && distance[i] >= distance[i-2]-distance[i-4]){
                return true;
            }
        }
        return false;
    }
}

/*
执行用时:3 ms ，在所有Java提交中击败了44.83%的用户
内存消耗:43.4 MB ，在所有Java提交中击败了 26.72%的用户

归纳了会有路径交叉的三种情况
*/
