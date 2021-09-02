/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode node = null;
        for(node = head; node != null; node = node.next){
            n++;
        }
        for(node = head; n > k; n--){
            node = node.next;
        }
        return node;
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:36.1 MB，在所有Java提交中击败了 79.89%的用户

Java中的指针用法和C类似
*/
