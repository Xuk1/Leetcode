class Solution {
    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        int left = 0, right = 0, ret = 0;
        Arrays.sort(ages);                                  //按升序排列ages
        for(int age : ages){
            if(age < 15){                                   //当age<15时，不能满足0.5×ages[x]+7<ages[y]≤ages[x]
                continue;
            }
            while(ages[left] <= 0.5 * age + 7){
                left++;
            }
            while(right+1 < n && ages[right+1] <= age){
                right++;
            }
            ret += right - left;
        }
        return ret;
    }
}

/*
执行用时:12 ms，在所有Java提交中击败了68.00%的用户
内存消耗:41.5 MB，在所有Java提交中击败了27.22%的用户

https://leetcode-cn.com/problems/friends-of-appropriate-ages/solution/gua-ling-de-peng-you-by-leetcode-solutio-v7yk/
*/
