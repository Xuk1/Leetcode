/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }

        int res = rootSum(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);
        return res;
    }

    public int rootSum(TreeNode root, int targetSum){
        int res = 0;
        if(root == null){
            return 0;
        }
        int val = root.val;
        if(val == targetSum){
            res++;
        }

        res += rootSum(root.left, targetSum - val);
        res += rootSum(root.right, targetSum - val);
        return res;
    }
}

/*
执行用时:27 ms ,在所有Java提交中击败了 20.02%的用户
内存消耗:38.2 MB，在所有Java提交中击败了 72.33%的用户

深度优先搜索
https://leetcode-cn.com/problems/path-sum-iii/solution/lu-jing-zong-he-iii-by-leetcode-solution-z9td/
*/
