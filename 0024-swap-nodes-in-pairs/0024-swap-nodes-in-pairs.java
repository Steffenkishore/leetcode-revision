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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode nxt = head.next;

        while (cur != null && nxt != null) {
            cur.next = nxt.next;
            nxt.next = cur;
            if (prev != null) {
                prev.next = nxt;
            } else {
                head = nxt;
            }

            cur = cur.next;
            if (cur != null) {
                nxt = cur.next;
            }
            if (prev == null) {
                prev = head.next;
            } else {
                prev = prev.next.next;
            }

        }

        return head;
        
    }
}