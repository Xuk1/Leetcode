class Solution {
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = arr[i];
        }
        return res;
    }
}

/*
执行用时:7 ms ,在所有Java提交中击败了64.09%的用户
内存消耗:48.1 MB，在所有Java提交中击败了34.99%的用户
*/
