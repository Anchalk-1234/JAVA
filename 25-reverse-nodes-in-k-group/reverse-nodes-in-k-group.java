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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
                 return head;
             }
            ListNode temp = head;
             int count = 0;//kitne node check kar leye

             // Check if k nodes are available
             while (temp != null && count < k) {
                 temp = temp.next;
                 count++;
             }
             // Reverse only when k nodes are available
             if (count == k) {
                ListNode prev = null;
                 ListNode curr = head;

                 for (int i = 0; i < k; i++) {//ek ek node ka link reverse
                     ListNode next = curr.next;
                     curr.next = prev;
                     prev = curr;
                     curr = next;
                 }

                 // Connect reversed group to the remaining list
                 head.next = reverseKGroup(curr, k);
                 return prev;
             }
             return head;
        
    }
}
