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
