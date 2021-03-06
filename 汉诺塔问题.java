class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        move(n, A, B, C);
    }

    public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C){
        if(n == 1){
            C.add(A.remove(A.size()-1));
            return;
        }else{
            move(n-1, A, C, B);
            C.add(A.remove(A.size()-1));
            move(n-1, B, A, C);
        }
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:36.1 MB ，在所有Java提交中击败了84.06%的用户
*/
