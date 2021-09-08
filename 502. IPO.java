class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = capital.length;
        int count = 0;
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));                                //降序排列的arr

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> (y - x));       //降序排列的优先队列
        for(int i=0; i<k; i++){
            while(count < n && arr[count][0] <= w){
                pq.add(arr[count][1]);
                count++;
            }
            if(!pq.isEmpty()){
                w += pq.poll();
            }else{
                break;
            }
        }
        return w;
    }
}

/*
执行用时:87 ms ,在所有Java提交中击败了42.25%的用户
内存消耗:59.4 MB ，在所有Java提交中击败了5.43%的用户

使用优先队列实现贪心算法
1. 可以使用lambda表达式实现降序排列
2. 当两组元素有关系并且需要排序的时候，可以把它们合并成一个二维数组，同时改变顺序
*/
