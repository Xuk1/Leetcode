class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int countA = 0;
        boolean flag = true;
        for(int i=0; i<arr.length; i++){            //计算缺勤次数
            if(arr[i] == 'A'){
                countA++;
            }
        }
        if(countA >= 2){
            flag = false;
        }
        int countL = 0;
        for(int i=0; i<arr.length-2; i++){
            if(arr[i] == 'L' && arr[i+1] == 'L' && arr[i+2] == 'L'){      //判断是否连续三天迟到
                flag = false;
                break;
            }
        }
        return flag;
    }
}

/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗：36.5 MB, 在所有 Java 提交中击败了39.66%的用户

在判断是否连续三天迟到的时候要把下标边界判断清楚，如果是i<arr.length-3，就会出现"PPALLL"用例测试结果为true的情况（原本应该是false）
*/
