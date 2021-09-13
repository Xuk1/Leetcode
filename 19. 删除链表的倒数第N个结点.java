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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode tmp = head;
        ListNode start = new ListNode(0, head);         //前驱结点
        ListNode cur = start;
        while(tmp != null){
            len++;
            tmp = tmp.next;
        }

        for(int i=1; i<len-n+1; ++i){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return start.next;
    }
}

/*
执行用时:0 ms，在所有Java提交中击败了100.00%的用户
内存消耗:36.4MB，在所有Java提交中击败了50.98%的用户

在对链表进行操作时，一种常用的技巧是添加一个哑节点 (dummy node)，它的neat 指针指向链表的头节点。这样一来，我们就不需要对头节点进行特殊的判断了。
例如，在本题中，如果我们要删除节点y，我们需要知道节点y的前驱节点x，并将x的指针指向y的后继节点。但由于头节点不存在前驱节点，因此我们需要在删除头节点时进行特殊判断。
但如果我们添加了哑节点，那么头节点的前驱节点就是哑节点本身，此时我们就只需要考虑通用的情况即可。特别地，在某些语言中，由于需要自行对内存进行管理。
因此在实际的面试中，对于「是否需要释放被删除节点对应的空间」这一问题，我们需要和面试官进行积极的沟通以达成一致。下面的代码中默认不释放空间。
*/
