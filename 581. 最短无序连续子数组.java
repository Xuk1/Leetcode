class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int[] comp = new int[len];                      //和原数组进行对比的排序后的数组
        if(isSorted(nums)){                             //如果nums本身就是有序的，输出0
            return 0;
        }

        int left = 0;                                   //从左开始的没有调换位置的元素个数
        int right = len-1;                              //从右开始的没有调换位置的元素个数
        System.arraycopy(nums, 0, comp, 0, len);        //把nums元素copy到comp中
        Arrays.sort(comp);                              //对comp进行排序
        while(nums[left] == comp[left]){                //获取从左开始的没有调换位置的元素个数
            left++;
        }
        while(nums[right] == comp[right]){              //获取从右开始的没有调换位置的元素个数
            right--;
        }
        return right-left+1;
    }

    public boolean isSorted(int[] nums){                //判断数组是否有序
        boolean flag = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

/*
执行用时: 6 ms ，在所有Java提交中击败了53.55%的用户
内存消耗:39.9 MB ，在所有Java提交中击败了 27.68%的用户

对于比较是否顺序有更换等目的的题目，可以使用更换后的与更换前的对比，从而计算更换了的元素的数目
要注意特殊情况，比如：本题中本就有序的数组输出应该是0，而用一般的方法的输出是1
*/
