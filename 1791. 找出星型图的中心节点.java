_________________________Optimized Solution_______________________________
class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1];
        if(a == edges[1][0] || a == edges[1][1]){
            return a;
        }
        return b;
    }
}

/*
执行用时: 0ms ,在所有Java提交中击败了100.00%的用户
内存消耗:64MB ，在所有Java提交中击败了 26.07%的用户
*/



___________________________First Solution__________________________________
class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = edges.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                map.put(edges[i][j], map.getOrDefault(edges[i][j], 0)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == n){
                return entry.getKey();
            }
        }
        return 0;
    }
}

/*
执行用时:22 ms，在所有Java提交中击败了11.00%的用户
内存消耗:78.9 MB，在所有Java提交中击败了 5.09%的用户
*/
