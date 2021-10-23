class Solution {
    public int[] constructRectangle(int area) {
        int[] ret = new int[2];
        int half = (int)Math.pow(area, 0.5);
        int L = 0;
        int W = 0;
        for(int i=half; i<=area; i++){
            if(area % i == 0){
                L = i;
                break;
            }
        }
        if(L == 0){
            for(int i=half; i>0; i--){
                if(area % i == 0){
                    L = i;
                    break;
                }
            }
        }
        W = area / L;
        ret[0] = Math.max(L, W);
        ret[1] = Math.min(L, W);
        return ret;
    }
}

/*
执行用时: 37 ms，在所有Java提交中击败了24.35%的用户
内存消耗:35.5 MB，在所有Java提交中击败了 97.75%的用户

重点是要找到L和W相差最小的时候，就从area的开方值开始找，这样L和W相差最小
*/
