class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lo = 0, hi = n-1;
        int max = 0, area = 0;
        while(lo < hi){
            area = Math.min(height[lo], height[hi]) * (hi - lo);
            max = area > max ? area : max;
            if(height[lo] <= height[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return max;
    }
}

/*
执行用时:3 ms ,在所有Java提交中击败了92.67%的用户
内存消耗:51.9 MB，在所有Java提交中击败了41.05%的用户

## 双指针
* 一个指针从左端，另一个指针从右端开始遍历
* 计算两根垂直线与x轴形成的容器能盛多少水，也就是围成的面积`area`，`area = Math.min(height[lo], height[hi]) * (hi - lo); `
* 由数学知识可知：每次移动y值更小的那根线，才可能找到面积更大的情况
* 所以，当`height[lo] <= height[hi]`的时候，左指针向右移动；反之，右指针向左移动
*/
