/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;

        while (pa != pb) {
            if (pa == null && pb == null) {
                return null;
            }

            if (pa == null) {
                pa = headA;
            } else {
                pa = pa.next;
            }

            if (pb == null) {
                pb = headB;
            } else {
                pb = pb.next;
            }
        }

        return pa;
        
    }
}