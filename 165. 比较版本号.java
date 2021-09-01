class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int len = Math.max(ver1.length, ver2.length);
        String[] v1 = new String[len];
        Arrays.fill(v1, "0");
        String[] v2 = new String[len];
        Arrays.fill(v2, "0");
        System.arraycopy(ver1, 0, v1, 0, ver1.length);
        System.arraycopy(ver2, 0, v2, 0, ver2.length);

        int res = 0;
        for(int i=0; i<len; i++){
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[i]);
            if(a > b){
                res = 1;
                break;
            }else if(a < b){
                res = -1;
                break;
            }
        }
        return res;
    }
}

/*
执行用时:1 ms ,在所有Java提交中击败了80.56%的用户
内存消耗:36.4 MB，在所有Java提交中击败了 66.68%的用户

需要注意不同长度的版本号的比较
比如：“1.0.1” 和 “1” 的比较，返回：1
处理成：[1, 0, 1] 和 [1, 0, 0]，这样的返回值才是正确的
也就是：把版本号分割后的值拷贝到相同长度的全为0的数组中，这样就可以保证短的版本号的剩余部分都为0
*/
