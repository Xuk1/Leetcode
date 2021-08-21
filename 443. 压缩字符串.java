class Solution {
    public int compress(char[] chars) {
        int left = 0;       //字符串组最左边的指针
        int right = 0;      //字符串组最右边的指针
        int write = 0;      //写指针
        int len = chars.length;
        for( ; right<len; right++){
            if(right == len-1 || chars[right] != chars[right+1]){       //当右指针到达字符串组最后一个
                chars[write++] = chars[right];      //写入这组的字符
                int num = right - left + 1;         //计算该组长度
                if(num > 1){
                    int tmp = write;                //定位到开始写该组长度的第一个位置
                    while(num > 0){
                        chars[write++] = (char) (num%10 + '0');
                        num = num/10;
                    }                               //将长度分割开，但是此时长度是反的，比如：长度为12，但写进数组的就是21
                    reverse(chars, tmp, write-1);   //为了把长度顺序正过来
                }
                left = right+1;                     //更新左指针到一个新的字符串组
            }
        }
        return write;
    }

    public void reverse(char[] chars, int left, int right){
        while(left < right){
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
    }
}
