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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode tmp = head;
        while(tmp != null){
            len++;
            tmp = tmp.next;
        }

        ListNode[] res = new ListNode[k];
        ListNode cur = head;
        int quo = len/k, rem = len%k;
        for(int i=0; i<k && cur != null; i++){
            res[i] = cur;
            int size = quo + (i < rem? 1 : 0);
            for(int j=1; j<size; j++){
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return res;
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了 100.00%的用户
内存消耗:38.5 MB，在所有Java提交中击败了 61.64%的用户

重点是将链表分成k段后，前len % k段的长度是len / k的大小再+1
*/
