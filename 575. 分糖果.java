class Solution {
    public int distributeCandies(int[] candyType) {
        int ave = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        int sort = set.size();
        if(sort >= ave){
            return ave;
        }else{
            return sort;
        }
    }
}

/*
执行用时:33 ms ，在所有Java提交中击败了62.34%的用户
内存消耗:40.4 MB，在所有Java提交中击败了35.95%的用户
*/
