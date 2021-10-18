/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        if(root.left != null){
            root.left.next = root.right;
            root.right.next = root.next != null? root.next.left: null;
            connect(root.left);
            connect(root.right);
        }
        return root;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:38.4 MB，在所有Java提交中击败了 85.84%的用户

使用dfs，注意递归在哪里进行
*/
