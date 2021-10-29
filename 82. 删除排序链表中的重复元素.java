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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(0, head);          //前驱结点
        int n = 0;                                      //链表的长度
        ListNode tmp = head;
        while(tmp != null){
            n++;
            tmp = tmp.next;
        }

        Map<Integer, Integer> map = new HashMap<>();    //存储链表中数字出现的次数
        Map<Integer, Integer> del = new HashMap<>();    //存储链表中要删除的数字
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp.val)){
                del.put(temp.val, 1);
            }else{
                map.put(temp.val, 1);
            }
            temp = temp.next;
        }

        ListNode cur = prev;
        while(cur.next != null){
            if(del.containsKey(cur.next.val)){
                ListNode help = cur.next.next;
                cur.next = help;
            }else{
                cur = cur.next;
            }
        }
        return prev.next;
    }
}

/*
执行用时:2 ms ,在所有Java提交中击败了 14.04%的用户
内存消耗: 37.8 MB，在所有Java提交中击败了 51.34%的用户
*/
