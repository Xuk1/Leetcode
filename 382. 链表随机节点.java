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
    List<Integer> list = new ArrayList<>();
    Random random = new Random(20220116);

    public Solution(ListNode head) {
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
 
 /*
执行用时:10 ms ,在所有Java提交中击败了 97.32%的用户
内存消耗:40.1 MB，在所有Java提交中击败了88.46%的用户
*/
