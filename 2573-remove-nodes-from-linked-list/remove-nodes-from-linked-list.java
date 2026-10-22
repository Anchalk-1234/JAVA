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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);///reverse kiya

        int max = head.val;
        ListNode curr = head;

        while (curr.next != null) {
            if (curr.next.val < max) {
                curr.next = curr.next.next;//delete next node as ager curr max seh  chota h
            } else {
                curr = curr.next;//as max ko update curr b ageh
                max = curr.val;
            }
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;//save next node
            curr.next = prev;//link ko revetse
            prev = curr;//prev ko ageh
            curr = next;//curr ageh
        }
        return prev;
    }
}
