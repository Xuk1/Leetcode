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
    ArrayList<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>();
        dfs(root);
        return list.get(k-1);
    }

    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}

/*
执行用时:1 ms ,在所有Java提交中击败了37.14%的用户
内存消耗:39.5 MB ，在所有Java提交中击败了13.22%的用户

二叉搜索树的中序遍历是升序排列的：左孩子 < 父节点 < 右孩子
https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/solution/lemonie-zhong-xu-bian-li-er-cha-sou-suo-uz01n/
*/
