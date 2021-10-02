class Solution {
    public String toHex(int num) {
        long nums = num;
        StringBuffer sb = new StringBuffer();
        if(nums == 0){
            return "0";
        }
        if(nums < 0){
            nums = (long)(Math.pow(2, 32) + num);
        }
        while(nums != 0){
            long remain = nums%16;
            String ins = Long.toString(remain);
            if(remain >= 10){
                if(remain == 10){
                    ins = "a";
                }else if(remain == 11){
                    ins = "b";
                }else if(remain == 12){
                    ins = "c";
                }else if(remain == 13){
                    ins = "d";
                }else if(remain == 14){
                    ins = "e";
                }else if(remain == 15){
                    ins = "f";
                }
            }
            nums = nums/16;
            sb.insert(0, ins);
        }
        String res = sb.toString();
        return res;
    }
}

/*
执行用时: 1 ms ，在所有Java提交中击败了14.46%的用户
内存消耗:35.5 MB，在所有Java提交中击败了82.25%的用户

利用数学中进制转换的知识解决
*/
