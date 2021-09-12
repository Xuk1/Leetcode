class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for(int i=0; i<numbers.length-1; i++){
            int left = i+1, right = numbers.length-1;
            while(left <= right){
                int mid = (right + left) / 2;
                if(numbers[mid] > (target - numbers[i])){
                    right = mid - 1;
                }else if(numbers[mid] < (target - numbers[i])){
                    left = mid + 1;
                }else{
                    res[0] = i+1;
                    res[1] = mid+1;
                    break;
                }
            }
        }
        return res;
    }
}

/*
执行用时:3 ms ,在所有Java提交中击败了25.98%的用户
内存消耗:38.8 MB，在所有Java提交中击败了15.27%的用户

使用二分查找优化的双重循环
*/






class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        boolean flag = true;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    res[0] = i+1;
                    res[1] = j+1;
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return res;
    }
}

/*
执行用时:194 ms ,在所有Java提交中击败了 8.71%的用户
内存消耗:38.6 MB，在所有Java提交中击败了 64.95%的用户

普通双重循环
*/
