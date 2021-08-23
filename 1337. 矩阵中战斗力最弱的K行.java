class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;                             //row
        int n = mat[0].length;                          //column
        int count = 0;                                  //计算军人数目
        int[] arr = new int[k];                         //用于存储行排序后的行数
        int write = 0;                                  //写入arr的指针
        List<Integer> list = new ArrayList<>();         //用于存储每行的军人数目
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            list.add(count);                            //存储该行的军人数目
            count = 0;                                  //count清零用于计算下一行的军人数目
        }
        int min = n+1;                                  //存储最弱的战斗力
        int minIndex = 0;                               //存储战斗力最弱的行数
        for(int i=0; i<k; i++){                         //只存储要输出的个数
            for(int j=0; j<list.size(); j++){           //获取最小的战斗力
                if(list.get(j) < min){
                    min = list.get(j);
                    minIndex = j;                       //保存最小战斗力的行数
                }
            }
            min = n+1;                                  //把用于比较的最小值变成最大的才能继续比较
            arr[write] = minIndex;                      //写入最小战斗力的行数
            list.set(minIndex, n+1);                    //存储完最小战斗力的行数后，就应该把这个最小的变成最大的，从而找到第二、第三小的...
            write++;
        }
        return arr;
    }
}

/*
执行用时:3 ms ,在所有Java提交中击败了21.73%的用户
内存消耗:39.4 MB ，在所有Java提交中击败了54.35%的用户

list相当于优化的数组，长度可以任意变换，可以增加、删除元素
要获取多个次小值的时候可以采用先获取最小值，再把最小值赋值成最大值，从而获得下一个最小值
*/
