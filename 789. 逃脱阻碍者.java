class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int myDis = Math.abs(target[0]) + Math.abs(target[1]);      //计算逃脱者到目的地的曼哈顿距离
        int[] gDis = new int[ghosts.length];
        boolean flag = true;
        for(int i=0; i<ghosts.length; i++){                         //计算每个ghost到目的地的曼哈顿距离
            gDis[i] = Math.abs(ghosts[i][0]-target[0]) + Math.abs(ghosts[i][1]-target[1]);
            if(gDis[i] <= myDis){                                   //如果ghosts的曼哈顿距离小于等于逃脱者的曼哈顿距离，则逃脱不成功
                flag = false;
            }
        }
        return flag;
    }
}

/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗：37.9 MB, 在所有 Java 提交中击败了73.53%的用户
*/
