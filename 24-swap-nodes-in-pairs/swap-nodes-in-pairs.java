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
   ListNode dummy = new ListNode(0);//create dummy node next to headd
    dummy.next = head;

    ListNode point = dummy;//yaha s chlu kiya

    // Ensure nodes we are swapping are not null
    while (point.next != null && point.next.next != null) {
      ListNode swap1 = point.next;//nodes jisko swap karna h
      ListNode swap2 = point.next.next;

      swap1.next = swap2.next;//swap
      swap2.next = swap1;

      // Prepare for next
      point.next = swap2;
      point = swap1;
    }
    return dummy.next;//srt node rreturn
}
}