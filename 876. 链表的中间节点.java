/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode cur = head;
        int mid = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }  
        mid = len / 2;
        for(int i=0; i<mid; i++){
            head = head.next;
        }
        return head;
    }
}

/*
执行用时:0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:36MB ,在所有Java提交中击败了18.32%的用户
*/
