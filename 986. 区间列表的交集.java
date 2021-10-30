class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int m = firstList.length, n = secondList.length;
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i < m && j < n){
            int low = Math.max(firstList[i][0], secondList[j][0]);
            int high = Math.min(firstList[i][1], secondList[j][1]);
            if(low <= high){
                list.add(new int[] {low, high});
            }
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

/*
执行用时: 3 ms ,在所有Java提交中击败了 97.41%的用户
内存消耗:39.4 MB ，在所有Java提交中击败了27.21%的用户

# 986. 区间列表的交集
## 使用双指针
* 在遍历两个数组时，因为需要求所有的交集，所以不能采用每个小数组一一对应的方式求交集，需要逐个比较
* 也就是说，我们需要添加比较条件，当`firstList[i][1]<secondList[j][1]`的时候，再让`secondList[j]和firstList[i+1]`比较，这样才能获得所有的交集
* 指针移动的条件也是：当`firstList[i][1]<secondList[j][1]`的时候：i++；当`firstList[i][1]>=secondList[j][1]`的时候：j++
*/
