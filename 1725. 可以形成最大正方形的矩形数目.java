class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int m = rectangles.length;
        int ret = 0;
        int[] len = new int[m];
        for(int i = 0; i < m; i++){
            len[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }
        Arrays.sort(len);
        int max = len[m-1];
        for(int i = m-1; i >= 0; i--){
            if(len[i] == max){
                ret++;
            }else{
                break;
            }
        }
        return ret;
    }
}

/*
执行用时:3 ms ,在所有Java提交中击败了 29.37%的用户
内存消耗:42MB ，在所有Java提交中击败了 5.59%的用户
*/
