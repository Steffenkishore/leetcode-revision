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
    private void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        int i = 0;
        int k = 0;
        int[] arr = new int[right - left + 1];
        ListNode cur = head;

        left = left - 1;
        right = right - 1;

        while (i <= right) {
            if (i >= left) {
                arr[k++] = cur.val;
            }
            i++;
            cur = cur.next;
        }

        reverse(arr);
        i = 0;
        k = 0;
        cur = head;

        while (i <= right) {
            if (i >= left) {
                cur.val = arr[k++];
            }
            i++;
            cur = cur.next;
        }

        return head;
        
    }
}