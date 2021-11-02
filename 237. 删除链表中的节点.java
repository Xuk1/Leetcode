/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;       //把要删除的节点的值改成下一个节点的值
        node.next = node.next.next;     //再删除下一个节点（因为无法删除自己）
    }
}

/*
执行用时:0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:37.9 MB，在所有Java提交中击败了32.95%的用户

* 因为传递的参数只有这个要删除的节点，所以无法通过找到其前驱节点来删除这个节点。
* 要做到删除这个节点的话，就把这个节点的值改成下个节点的值，然后删除下个节点，以达到相同的目的。
*/
